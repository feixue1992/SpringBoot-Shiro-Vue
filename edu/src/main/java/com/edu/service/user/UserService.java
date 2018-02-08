package com.edu.service.user;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: lzh
 * @description: 用户/角色/权限
 * @date: 2018/02/06 10:18
 */
public interface UserService {

    /**
     * 获取用户列表
     * @param jsonObject
     * @return
     */
    JSONObject getUserList(JSONObject jsonObject);
}
