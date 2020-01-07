package com.zjh.space.entity.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-07
 * @function :文章分类 */

@Data
public class ArticleCategory {

    private Long id;

    private Long categoryId;

    private Long articleId;

    private Date createBy;

    private Date modifiedBy;
}
