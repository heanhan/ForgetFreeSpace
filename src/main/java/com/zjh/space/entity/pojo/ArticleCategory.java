package com.zjh.space.entity.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function : 博客文章的分类表  中间表
 */

@Data
@Entity
@Table(name = "space_article_category")
public class ArticleCategory  implements Serializable {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 关联的分类id
     */
    @Column(name = "category_id")
    private Long categoryId;

    /**
     *关联的文章id;
     */
    @Column(name = "article_id")
    private Long articleId;

    /**
     *创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 是否有效  默认1 有效 0 为无效
     */
    @Column(name = "is_effective")
    private int isEffective;
}
