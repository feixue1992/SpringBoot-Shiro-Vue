package com.edu.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edu.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 系统用户表 Mapper 接口
 * </p>
 *
 * @author lzh123
 * @since 2018-02-08
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<SysUser> getUserList(@Param("name") String name);
}
