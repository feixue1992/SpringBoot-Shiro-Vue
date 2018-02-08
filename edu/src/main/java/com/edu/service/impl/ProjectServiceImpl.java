package com.edu.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.edu.dao.project.ProjectDao;
import com.edu.dao.project.ProjectStageDao;
import com.edu.dao.project.UserProjectDao;
import com.edu.entity.project.Project;
import com.edu.entity.project.ProjectStage;
import com.edu.entity.project.UserProject;
import com.edu.service.project.ProjectService;
import com.edu.util.CommonUtil;
import com.edu.util.StringTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 项目实现
 *
 * @author lzh
 * @create 2018-02-07-16:44
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;
    @Autowired
    private UserProjectDao userProjectDao;
    @Autowired
    private ProjectStageDao projectStageDao;

    /**
     * 保存项目
     *
     * @param jsonObject
     * @return
     */
    @Transactional(rollbackOn = Exception.class)
    @Override
    public JSONObject saveProject(JSONObject jsonObject) {
        Project project = JSON.parseObject(jsonObject.toJSONString(), Project.class);
        project.setCreateTime(new Date());
        project.setUpdateTime(new Date());
        project.setCurrStage(0);
        projectDao.save(project);


        List<Map<String, String>> users = jsonObject.getObject("users", List.class);

        List<UserProject> userProjects = null;
        //保存用户项目关联关系
        if (users != null && users.size() > 0) {
            userProjects = users.stream()
                    .map(user -> {
                        UserProject userProject = new UserProject();
                        userProject.setUserId(Integer.parseInt(user.get("userId")));
                        userProject.setProjectId(project.getId());
                        userProject.setUserType(Integer.parseInt(user.get("userType")));
                        return userProject;
                    })
                    .collect(Collectors.toList());
        }

        String stages = jsonObject.getString("stages");
        List<ProjectStage> projectStages = new ArrayList<>();
        if (!StringTools.isNullOrEmpty(stages)) {
            String[] stageIds = stages.split(",");
            for (String stageId : stageIds) {
                ProjectStage projectStage = new ProjectStage();
                projectStage.setProjectId(project.getId());
                projectStage.setStageId(Integer.parseInt(stageId));
                projectStages.add(projectStage);
            }
        }

        //保存项目各个部门负责人信息
        userProjectDao.save(userProjects);
        //保存项目阶段信息
        projectStageDao.save(projectStages);

        return CommonUtil.successJson();
    }
}
