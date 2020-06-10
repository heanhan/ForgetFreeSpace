package com.zjh.space.dao;

import com.zjh.space.entity.pojo.Article;
import org.springframework.stereotype.Repository;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :
 */

@Repository
public interface ArticleDao {

    //添加博客文章

    Article addArticle(Article article);
}
