package com.zjh.space.service;

import com.zjh.space.entity.pojo.BlogLogs;

import java.util.List;

/**
 * @author by zhaojh0912
 * @Description   通过切面实现 博客的 操作日志
 * @Date 2020/6/13 9:03 下午
 */
public interface BlogLogsService {

    /**
     * 添加博客的操作日志
     * @param blogLogs 日志记录
     * @return  boolean
     */
    boolean saveBlogLogs(BlogLogs blogLogs);

    /**
     * 带有分页的查询 日志  动态条件
     * @param blogLogs 日志实体
     * @param index 当前的页
     * @param pageSize 每页大小
     * @return List
     */
    List<BlogLogs> findBlogLogsByCondition(BlogLogs blogLogs,Integer index,Integer pageSize);

    /**
     * 通过id 查询日志的详情
     * @param id 日志的id
     * @return BlogLogs
     */
    BlogLogs findBlogLogsById(Long id);
}
