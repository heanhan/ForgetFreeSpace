package com.zjh.space.entity.vo;

import lombok.Data;

/**
 * @author by zhaojh0912
 * @Description  用户的 Vo
 * @Date 2020/6/11 4:35 下午
 */
@Data
public class UserVo {

    /**
     * 用户的id
     */
    private Long id;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 头像
     */
    private String headPhoto;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户的座右铭
     */
    private String motto;

    /**
     * 登录次数
     */
    private int loginCount;

    /**
     * 联系方式
     */
    private String telPhone;

    /**
     * 个人简介
     */
    private String description;
}
