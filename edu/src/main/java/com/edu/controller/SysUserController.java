package com.edu.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.edu.dao.SysUserMapper;
import com.edu.entity.SysUser;
import com.edu.service.SysUserService;
import com.edu.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 系统用户表 前端控制器
 * </p>
 *
 * @author lzh123
 * @since 2018-02-08
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("list")
    public JSONObject getUserLit(Page page) {
        List<SysUser> sysUserMapperList = sysUserMapper.getUserList("lzh");
        Page<SysUser> sysUserPage = sysUserService.selectPage(page);
        List<SysUser> sysUsers = sysUserService.selectList(null);
        Page<SysUser> pages = sysUserService.selectPage(page, new EntityWrapper<SysUser>().like("name", "lzh")
            .addFilter(" id = {0} and name = {1}", 33333, "lzh2")
        );
        return CommonUtil.successJson(sysUserPage);
    }
}

