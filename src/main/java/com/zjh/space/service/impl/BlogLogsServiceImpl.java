package com.zjh.space.service.impl;

import com.zjh.space.dao.BlogLogsDao;
import com.zjh.space.entity.pojo.BlogLogs;
import com.zjh.space.service.BlogLogsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @author by zhaojh0912
 * @Description TODO
 * @Date 2020/6/13 9:03 下午
 */
@Service
public class BlogLogsServiceImpl implements BlogLogsService {

    @Resource
    private BlogLogsDao blogLogsDao;


    /**
     * 添加博客的操作日志
     *
     * @param blogLogs 日志记录
     * @return boolean
     */
    @Override
    public boolean saveBlogLogs(BlogLogs blogLogs) {
        BlogLogs logs = blogLogsDao.save(blogLogs);
        if(null!=logs){
            return true;
        }
        return false;
    }

    /**
     * 带有分页的查询 日志  动态条件
     *
     * @param blogLogs 日志实体
     * @param index    当前的页
     * @param pageSize 每页大小
     * @return List
     */
    @Override
    public List<BlogLogs> findBlogLogsByCondition(BlogLogs blogLogs, Integer index, Integer pageSize) {

        /**
         * 封装分页的参数
         */
        PageRequest pageRequest = PageRequest.of(index, pageSize);
        /**
         * 封装动态的条件
         */
        Specification<BlogLogs> spec=new Specification<BlogLogs>() {
            @Override
            public Predicate toPredicate(Root<BlogLogs> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<BlogLogs> ip = root.get("ip");

                return null;
            }
        };
        Page<BlogLogs> logsPage = blogLogsDao.findAll(spec, pageRequest);
        return null;
    }

    /**
     * 通过id 查询日志的详情
     *
     * @param id 日志的id
     * @return BlogLogs
     */
    @Override
    public BlogLogs findBlogLogsById(Long id) {
        return null;
    }
}
