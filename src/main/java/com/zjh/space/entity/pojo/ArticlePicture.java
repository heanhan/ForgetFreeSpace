package com.zjh.space.entity.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-07
 * @function :文章图片
 *
 */

@Data
public class ArticlePicture {
    private Long id;

    private Long articleId;//对应文章id

    private String pictureUrl;//图片的url

    private Date createTime;//创建时间

    private Date modifiedTime;//修改时间

}
