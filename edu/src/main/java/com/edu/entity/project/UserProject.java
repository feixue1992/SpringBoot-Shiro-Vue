package com.edu.entity.project;

import com.edu.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 负责人和 项目关联表
 *
 * @author lzh
 * @create 2018-02-07-16:21
 */
@Entity
@Table(name = "sys_user_project")
@Data
public class UserProject extends BaseEntity {
    //项目id
    private Integer projectId;
    //对应项目负责人id；
    private Integer userId;
    /**
     * 用户类型
     * 0 商务，销售
     * 1 产品
     * 2 java开发
     * 3 ios开发
     * 4 android开发
     * 5 前端
     * 6 设计
     * 7 测试
     */
    @Column(nullable = false)
    private Integer userType;
}
