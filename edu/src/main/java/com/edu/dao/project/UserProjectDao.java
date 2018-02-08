package com.edu.dao.project;

import com.edu.entity.project.UserProject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户项目dao
 *
 * @author lzh
 * @create 2018-02-07-16:38
 */
public interface UserProjectDao extends JpaRepository<UserProject, Integer>{
}
