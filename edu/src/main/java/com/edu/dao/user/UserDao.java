package com.edu.dao.user;

import com.edu.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author: lzh
 * @description: 用户/角色/权限
 * @date: 2018-02-06 15:08:45
 */
public interface UserDao extends JpaRepository<User, Integer>, JpaSpecificationExecutor {

}
