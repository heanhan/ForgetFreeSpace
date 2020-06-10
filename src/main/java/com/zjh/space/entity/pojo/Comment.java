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
 * @function : 评论留言
 */

@Data
@Entity
@Table(name = "space_comment")
public class Comment implements Serializable {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 留言评论内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 用户自定义的名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 留言/评论的者的ip
     */
    @Column(name = "ip")
    private String ip;

    /**
     * 是否有效，默认1有效，0为无效
     */
    @Column(name = "is_effective")
    private int isEffective;

}
