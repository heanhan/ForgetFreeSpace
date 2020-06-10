package com.zjh.space.entity.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : zhaojh
 * @date : 2020-01-07
 * @function :用户的实体
 */

@Data
@Entity
@Table(name = "space_user")
public class User {

    /**
     * 用户的id
     */
    @Id
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;
}
