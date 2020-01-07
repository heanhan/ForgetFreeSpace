package com.zjh.space.entity.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-07
 * @function :
 */

@Data
public class Article {

    private Long id;//文章id

    private String title;//文章标题

    private String summary;//文章的简介，默认200个汉字

    private Boolean isTop;//是否是置顶

    private Integer traffic;//文章访问量

    private Date createTime;//创建时间

    private Date modifiedTime;//修改时间
}
