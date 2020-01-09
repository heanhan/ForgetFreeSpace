package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function : 博客文章配的图
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticlePicture implements Serializable {

    private Long id;//主键

    private Long articleId;//文章id

    private String pictureUrl;//图片的地址

    private Date createTime;//创建时间

    private Date modifiedTime;//修改时间
}
