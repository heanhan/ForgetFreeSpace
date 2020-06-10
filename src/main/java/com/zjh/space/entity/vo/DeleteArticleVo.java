package com.zjh.space.entity.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author by zhaojh0912
 * @Description TODO
 * @Date 2020/6/10 11:15 下午
 */

@Data
public class DeleteArticleVo {

    /**
     * 主键
     */
    private Long id;

    /**
     *文章标题
     */
    private String title;


}
