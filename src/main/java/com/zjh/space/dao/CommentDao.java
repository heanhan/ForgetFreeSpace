package com.zjh.space.dao;

import com.zjh.space.entity.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author by zhaojh0912
 * @Description 用户评论的持久层
 * @Date 2020/6/11 5:12 下午
 */
@Repository
public interface CommentDao extends JpaRepository<Comment,Long>, JpaSpecificationExecutor<Comment> {
}
