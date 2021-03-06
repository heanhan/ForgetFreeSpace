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
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 头像
     */
    @Column(name = "head_photo")
    private String headPhoto;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 用户的座右铭
     */
    @Column(name = "motto")
    private String motto;

    /**
     * 登录次数
     */
    @Column(name = "login_count")
    private int loginCount;

    /**
     * 联系方式
     */
    @Column(name = "tel_phone")
    private String telPhone;

    /**
     * 个人简介
     */
    @Column(name = "description")
    private String description;
}
