package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private Long id;//主键

    private String content;//文章内容

    private Long articleId;//关联的文章id

    private Long commentId;//文章对应留言的id

    private Date createTime;//创建时间

    private int isEffective;//是否有效 默认为 1 有效，置0 无效
}
