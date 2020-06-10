package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleContent implements Serializable {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 文章内容
     */
    @Column(name = "content")
    private String content;

    /**
     *关联的文章id
     */
    @Column(name = "articleId")
    private Long articleId;

    /**
     *文章对应留言的id
     */
    @Column(name = "commentId")
    private Long commentId;

    /**
     *创建时间
     */
    @Column(name = "createTime")
    private Date createTime;

    /**
     *是否有效 默认为 1 有效，置0 无效
     */
    @Column(name = "isEffective")
    private int isEffective;
}
