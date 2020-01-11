package com.zjh.space.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: Swagger2Config
 * @Author: zhaojh0912
 * @Dae: 2020-01-09
 * @Vsersion: 1.0.0
 * @Description: TOO
 */

/*@Configuration
@EnableSwagger2*/
public class Swagger2Config {
/*
    *//**
     * 添加摘要信息(Docket)
     * @return Docket
     *//*
    //指定扫描哪些包
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(swaggeInfo())
                .select()
                //要扫描的包路径
                .apis(RequestHandlerSelectors.basePackage("com.zjh.space.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    //配置swagger的基本信息
    private ApiInfo swaggeInfo(){
        return new ApiInfoBuilder()
                .title("个人博客的接口文档")
                //创始人
                .contact(new Contact("zhaojh0912","https://github.com/heanhan","1763124707@qq.com"))
                //版本
                .version("v1.0")
                //描述
                .description("API 描述")
                .build();
    }*/
}
