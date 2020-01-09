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

    private Long id;//主键

    private String content;//留言评论内容

    private Date createTime;//创建时间

    private String email;//邮箱

    private String name;//用户自定义的名称

    private String ip;//留言/评论的者的ip

    private int isEffective;//是否有效，默认1有效，0为无效

}
