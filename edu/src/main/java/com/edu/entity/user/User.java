package com.edu.entity.user;

import com.edu.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户实体
 *
 * @author lzh
 * @create 2018-02-06-15:17
 */
@Entity
@Table(name = "sys_user")
@Data
public class User extends BaseEntity implements Serializable {

    private String name;
    /**
     * 0 男 1 女
     */
    private String sex;

}
