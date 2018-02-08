package com.edu.dao.project;

import com.edu.entity.project.StageNote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 项目各阶段备注dao
 *
 * @author lzh
 * @create 2018-02-07-16:37
 */
public interface StageNoteDao extends JpaRepository<StageNote, Integer>{
}
