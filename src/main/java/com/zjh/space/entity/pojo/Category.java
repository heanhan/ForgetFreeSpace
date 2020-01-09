package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function : 分类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {

    private Long id;//主键

    private String name;//分类名称

    private int number;//该分类下的文章数量

    private Date createTimel;//创建时间

    private Date modifiedTime;//修改时间

    private int isEffective;//是否有效 默认为1 有效 0 为无效
}
