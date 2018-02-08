package com.edu.dao.project;

import com.edu.entity.project.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lizhenhui
 * @create 2018-02-07 16:36
 */
public interface StageDao extends JpaRepository<Stage, Integer> {
}
