package com.zjh.space.mapper;

import com.zjh.space.entity.pojo.Article;
import org.springframework.stereotype.Repository;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :
 */

@Repository
public interface ArticleMapper {

    //添加博客文章

    int addArticle(Article article);
}
