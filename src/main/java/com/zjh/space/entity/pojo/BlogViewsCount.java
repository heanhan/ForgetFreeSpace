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
 * @function :浏览表 */

@Data
@Entity
@Table(name = "space_blog_view_count")
public class BlogViewsCount implements Serializable {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * ip
     */
    @Column(name = "ip")
    private String ip;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
}
