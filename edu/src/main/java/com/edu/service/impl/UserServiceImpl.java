package com.edu.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.edu.dao.user.UserDao;
import com.edu.entity.user.User;
import com.edu.service.user.UserService;
import com.edu.util.CommonUtil;
import com.edu.util.StringTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: lzh
 * @description: 用户/角色/权限
 * @date: 2018/02/06 10:18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 获取用户里列表分页
     * @param jsonObject
     * @return
     */
    @Override
    public JSONObject getUserList(JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        Integer id = jsonObject.getInteger("id");
        int currPage = 0;
        if (!StringTools.isNullOrEmpty(jsonObject.getInteger("currentPage"))) {
            currPage = jsonObject.getInteger("currentPage");
        }
        Pageable pageable = new PageRequest(currPage, 10);

        Page<User> userList = userDao.findAll((root, criteriaQuery, criteriaBuilder) -> {
            Path<String> tName = root.get("name");
            Path<Integer> tId = root.get("id");
            List<Predicate> predicates = new ArrayList<>();
            if (!StringTools.isNullOrEmpty(name)) {
                predicates.add(criteriaBuilder.like(tName, "%" + name + "%"));
            }
            if (id != null) {
                predicates.add(criteriaBuilder.equal(tId, id));
            }
            Predicate[] p = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(p));
        }, pageable);
        return CommonUtil.successJson(userList);
    }
}
