package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function : 博客文章配的图
 */

@Data
@Entity
@Table(name = "space_article_picture")
public class ArticlePicture implements Serializable {

    /**
     * 主键
     */
    @Id
    private Long id;


    /**
     *文章id
     */
    @Column(name = "article_id")
    private Long articleId;

    /**
     *图片的地址
     */
    @Column(name = "picture_url")
    private String pictureUrl;

    /**
     *创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     *修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;
}
