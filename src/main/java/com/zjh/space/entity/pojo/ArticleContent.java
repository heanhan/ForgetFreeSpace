package com.zjh.space.entity.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-07
 * @function :文章内容 */

@Data
public class ArticleContent {

    private Long id;//主键

    private String content;//内容

    private Long articleId;//文章的id

    private Date createTime;//创建时间

    private Date modifiedTime;//修改时间
}
