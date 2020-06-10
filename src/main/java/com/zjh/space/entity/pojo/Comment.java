package com.zjh.space.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function : 评论留言
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 留言评论内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户自定义的名称
     */
    private String name;

    /**
     * 留言/评论的者的ip
     */
    private String ip;

    /**
     * 是否有效，默认1有效，0为无效
     */
    private int isEffective;

}
