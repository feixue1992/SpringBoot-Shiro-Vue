package com.edu.service.project;

import com.alibaba.fastjson.JSONObject;

/**
 * 项目业务层
 *
 * @author lzh
 * @create 2018-02-07-16:41
 */
public interface ProjectService {
    /**
     * 创建项目
     * @param jsonObject
     * @return
     */
    JSONObject saveProject(JSONObject jsonObject);
}
