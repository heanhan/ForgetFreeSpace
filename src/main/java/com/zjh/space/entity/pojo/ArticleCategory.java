package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function : 博客文章的分类表  中间表
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleCategory  implements Serializable {

    private Long id;//主键

    private Long categoryId;//关联的分类id

    private Long articleId;//关联的文章id;

    private Date createTime;//创建时间

    private Date modifiedTime;//修改时间

    private int isEffective;//是否有效  默认1 有效 0 为无效
}
