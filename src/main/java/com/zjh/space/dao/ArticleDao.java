package com.zjh.space.dao;

import com.zjh.space.entity.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :
 */

@Repository
public interface ArticleDao extends JpaRepository<Article,Long>, JpaSpecificationExecutor<Article> {

}
