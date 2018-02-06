package com.edu.controller;

import com.alibaba.fastjson.JSONObject;
import com.edu.util.CommonUtil;
import com.edu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: lzh
 * @description: 登录相关Controller
 * @date: 2018/02/06
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
//     * 登录
//     *
//     * @param requestJson
//     * @return
//     */
//    @PostMapping("/auth")
//    public JSONObject authLogin(@RequestBody JSONObject requestJson) {
//        CommonUtil.hasAllRequired(requestJson, "username,password");
//        return loginService.authLogin(requestJson);
//    }
//
//    /**
//     * 查询当前登录用户的信息
//     *
//     * @return
//     */
//    @PostMapping("/getInfo")
//    public JSONObject getInfo() {
//        return loginService.getInfo();
//    }
//
//    /**
//     * 登出
//     *
//     * @return
//     */
//    @PostMapping("/logout")
//    public JSONObject logout() {
//        return loginService.logout();
//    }
}
