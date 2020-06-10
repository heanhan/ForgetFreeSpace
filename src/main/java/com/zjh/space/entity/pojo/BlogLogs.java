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
 * @function :  记录系统的日志实体
 */

@Data
@Entity
@Table(name = "space_blog_logs")
public class BlogLogs  implements Serializable {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 操作的ip
     */
    @Column(name = "ip")
    private String ip;

    /**
     *创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     *操作的内容
     */
    @Column(name = "operator_content")
    private String operatorContent;

    /**
     *操作访问的地址
     */
    @Column(name = "operator_url")
    private String operatorUrl;

    /**
     *操作的浏览器
     */
    @Column(name = "operator_scan")
    private String operatorScan;

}
