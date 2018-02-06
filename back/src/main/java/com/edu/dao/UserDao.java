package com.edu.dao;

import com.edu.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: lzh
 * @description: 用户/角色/权限
 * @date: 2018-02-06 15:08:45
 */
public interface UserDao extends JpaRepository<User, Long> {

    Page<User> findUserByNameLike(String name, Pageable pageable);

}
