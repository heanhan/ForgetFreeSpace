package com.zjh.space.service;

import com.zjh.space.entity.pojo.Article;

public interface ArticleService {
    /**
     * 添加文章
     * @param article 文章实体
     * @return
     */
    Boolean addArticle(Article article);
}
