package com.edu.entity.project;

import com.edu.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 阶段 (主要用于，选择项目有那几个阶段，到了哪个阶段)
 *
 * @author lzh
 * @create 2018-02-07-16:06
 */
@Entity
@Table(name = "sys_level")
@Data
public class Stage extends BaseEntity {
    //阶段名
    private String name;
    //排序 ，默认是0 降序
    private Integer sort;
}
