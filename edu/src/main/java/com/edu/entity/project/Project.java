package com.edu.entity.project;

import com.edu.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 项目实体
 *
 * @author lzh
 * @create 2018-02-07-15:53
 */
@Entity
@Table(name = "sys_project")
@Data
public class Project extends BaseEntity{
    //项目名
    private String name;
    //客户信息
    private String customerInfo;
    //业务类型 (pc, h5, ios, android) 等
    private Integer businessType;
    //计划开发时间
    private Integer planWorkTime;
    //实际开发时间
    private Integer realityWorkTime;
    //项目类型 (源码， 标准版，半定制，全定制)
    private Integer projectType;  // 0 源码， 1 标准版， 2 半定制， 3 全定制
    //当前阶段
    private Integer currStage;
    //项目启动时间
    private Date startTime;
    //项目描述
    private String description;
}
