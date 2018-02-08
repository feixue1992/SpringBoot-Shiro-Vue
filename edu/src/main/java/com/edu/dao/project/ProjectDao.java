package com.edu.dao.project;

import com.edu.entity.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 项目dao
 *
 * @author lzh
 * @create 2018-02-07-16:34
 */
public interface ProjectDao extends JpaRepository<Project, Integer>{

}
