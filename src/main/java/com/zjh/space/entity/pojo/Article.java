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
 * @function : 文章
 */

@Data
@Entity
@Table(name = "space_article")
public class Article implements Serializable {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     *文章标题
     */
    @Column(name = "title")
    private String title;

    /**
     *文章简介概要，默认500个汉字
     */
    @Column(name = "summary")
    private String  summary;

    /**
     *文章是否置顶，0为否，1是
     */
    @Column(name = "isTop")
    private String isTop;

    /**
     *访问量
     */
    @Column(name = "traffic")
    private Long traffic;

    /**
     *创建时间
     */
    @Column(name = "createTime")
    private Date createTime;

    /**
     *修改时间
     */
    @Column(name = "modifiedTime")
    private Date modifiedTime;

}
