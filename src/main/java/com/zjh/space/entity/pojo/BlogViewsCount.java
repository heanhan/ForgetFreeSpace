package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :浏览表 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogViewsCount implements Serializable {

    private Long id;//主键

    private String ip;//ip

    private Date createTime;//创建时间
}
