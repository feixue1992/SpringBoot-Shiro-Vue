package com.edu.entity.project;

import com.edu.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 项目各阶段备注
 *
 * @author lzh
 * @create 2018-02-07-16:29
 */
@Entity
@Table(name = "sys_stage_note")
@Data
public class StageNote extends BaseEntity{
    //项目对应阶段的id
    private Integer projectStageId;
    /**
     * 项目id
     * 冗余字段，方便之后的统计(把对应的项目id放进去)
     */
    @Column(nullable = false)
    private Integer projectId;
    /**
     * 阶段id；
     * 冗余字段，方便之后统计 (把对应的阶段id放进去)
     */
    @Column(nullable = false)
    private Integer levelId;
    /**
     * 备注
     */
    private String note;
}
