package com.zjh.space.controller;

import com.zjh.space.entity.pojo.Article;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :
 */
@Api
@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @PostMapping(value = "/addArticle")
    public String addArticle(Article article){

        return null;
    }
}
