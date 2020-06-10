package com.zjh.space.controller;

import com.zjh.space.entity.pojo.Article;
import com.zjh.space.entity.vo.DeleteArticleVo;
import com.zjh.space.service.ArticleService;
import com.zjh.space.unit.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author : zhaojh
 * @date : 2020-01-09
 * @function :
 */
@Api
@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 开关法门  作为返回的引用
     */
    Boolean flag=false;

    /**
     * 添加文章
     * @param article
     * @return
     */
    @PostMapping(value = "/addArticle")
    public Result addArticle(@RequestBody @Valid Article article){
        flag =articleService.addArticle(article);
        return Result.ok().message("添加文章");
    }

    @DeleteMapping(value = "/deleteArtile")
    public Result deleteArtile(@RequestBody @Valid DeleteArticleVo deleteArticleVo){

        return null;
    }

}
