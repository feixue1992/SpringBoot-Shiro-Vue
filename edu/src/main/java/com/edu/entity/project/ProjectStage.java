package com.edu.entity.project;

import com.edu.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 项目阶段关联表
 *
 * @author lzh
 * @create 2018-02-07-16:09
 */
@Entity
@Table(name = "sys_project_level")
@Data
public class ProjectStage extends BaseEntity {
    //项目id
    private Integer projectId;
    //阶段id；
    private Integer stageId;

    /**
     * baseEntity 里面的status表示各阶段的状态
     * 0 默认状态， 未开始
     * 1 正在进行中
     * 2 已结束
     */
}
