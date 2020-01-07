package com.zjh.space.entity.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-07
 * @function :分类 */

@Data
public class Category {

    private Long id;//主键

    private Long categoryId;//分类id

    private Long articleId;//文章id

    private Date createTime;//创建时间

    private Date modifiedTime;//修改时间

    private int isEffective;//是否有效，默认为1有效，为0无效'
}
