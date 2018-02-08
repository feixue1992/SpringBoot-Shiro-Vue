package com.edu.dao.project;

import com.edu.entity.project.ProjectStage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lizhenhui
 * @create 2018-02-07 16:35
 * @description 项目阶段dao
 */
public interface ProjectStageDao extends JpaRepository<ProjectStage, Integer> {
}
