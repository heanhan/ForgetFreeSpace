package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function : 文章
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Serializable {

    private Long id;//主键

    private String title;//文章标题

    private String  summary;//文章简介概要，默认500个汉字

    private String isTop;//文章是否置顶，0为否，1是

    private Long traffic;//访问量

    private Date createTime;//创建时间

    private Date modifiedTime;//修改时间

}
