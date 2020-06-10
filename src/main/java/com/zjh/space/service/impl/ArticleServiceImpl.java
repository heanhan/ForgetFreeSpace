package com.zjh.space.service.impl;

import com.zjh.space.entity.pojo.Article;
import com.zjh.space.dao.ArticleDao;
import com.zjh.space.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :
 */

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public Boolean addArticle(Article article) {
        Article article1 =articleDao.save(article);
        if(null!=article1){
            return true;
        }
        return false;
    }
}
