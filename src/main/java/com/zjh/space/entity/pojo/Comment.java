package com.zjh.space.entity.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author : zhaojh
 * @date : 2020-01-07
 * @function :评论
 */

@Data
public class Comment {
    private Long id;//主键
    private String content;//留言/评论内容
    private Date createTime;//创建时间
    private String email;//邮箱，用户回复消息
    private String name;//用户自定义的名称
    private String ip;//'留言/评论IP
    private int isEffective;//是否有效，默认为1为有效，0为无效

}
