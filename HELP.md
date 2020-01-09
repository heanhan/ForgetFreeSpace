# 个人博客搭建过程

### 前期准备

#### 博客

        个人博客实现 游客模式、以及后台管理
        
        浏览模式：
            主要分为 ：
                首页：主图上展示最新的一个博客，然后在组图的左下角展示最近的五篇文章
                博客：存放所有的博客
                关于我：存放一些一写留言，以及简单的自我介绍
                简历：个人简历，找工作用
                
         后台管理模式：   
         
            对自己的博客进行管理：
                个人博客的管理；
                网站数据的统计；
                缓存管理；
                系统设置：
                留言板管理:对一些不友好的留言进行删除
                
        
        数据库表的设计：
        
        日志表：blog_logs
        
            CREATE TABLE `blog_logs` (
              `id` bigint(40) NOT NULL AUTO_INCREMENT COMMENT '主键',
              `ip` varchar(20) NOT NULL DEFAULT '' COMMENT '操作地址的IP',
              `create_time` datetime NOT NULL COMMENT '操作时间',
              `operator_content` varchar(255) NOT NULL DEFAULT '' COMMENT '操作内容',
              `operate_url` varchar(50) NOT NULL DEFAULT '' COMMENT '操作的访问地址',
              `operate_scan` varchar(20) DEFAULT '' COMMENT '操作的浏览器',
              PRIMARY KEY (`id`)
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
            
            
            
        浏览量表：blog_views_count
        
            CREATE TABLE `blog_views_count` (
              `id` bigint(40) NOT NULL AUTO_INCREMENT,
              `ip` varchar(20) NOT NULL COMMENT '访问IP',
              `create_time` datetime NOT NULL COMMENT '访问时间',
              PRIMARY KEY (`id`)
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
        
            用于保存每一次博客的主页的访问量
            
        留言、评论表：comment
        
            CREATE TABLE `comment` (
              `id` bigint(40) NOT NULL AUTO_INCREMENT COMMENT '主键',
              `content` varchar(500) NOT NULL DEFAULT '' COMMENT '留言/评论内容',
              `create_time` datetime NOT NULL COMMENT '创建日期',
              `email` varchar(20) NOT NULL DEFAULT '' COMMENT '邮箱，用于回复消息',
              `name` varchar(50) NOT NULL DEFAULT '' COMMENT '用户自己定义的名称',
              `ip` varchar(20) NOT NULL DEFAULT '' COMMENT '留言/评论IP',
              `is_effective` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效，默认为1为有效，0为无效',
              PRIMARY KEY (`id`)
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='因为message分为两种，一种是留言，一种是评论，这里搞成一张表是因为它们几乎是拥有相同的字段，我觉得没必要分成两张表来进行维护';
            
         
        分类表：category
           
           CREATE TABLE `category` (
             `id` bigint(40) NOT NULL AUTO_INCREMENT,
             `name` varchar(20) NOT NULL COMMENT '分类名称',
             `number` tinyint(10) NOT NULL DEFAULT '0' COMMENT '该分类下的文章数量',
             `create_time` datetime NOT NULL COMMENT '分类创建时间',
             `modified_time` datetime NOT NULL COMMENT '分类修改时间',
             `is_effective` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效，默认为1有效，为0无效',
             PRIMARY KEY (`id`)
           ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
           
           这是一个分类，存放 自定义的分类类型
           
           
        博客文章：article
        
            CREATE TABLE `article` (
              `id` bigint(40) NOT NULL AUTO_INCREMENT COMMENT '主键',
              `title` varchar(50) NOT NULL DEFAULT '' COMMENT '文章标题',
              `summary` varchar(300) NOT NULL DEFAULT '' COMMENT '文章简介概要，默认100个汉字以内',
              `is_top` tinyint(1) NOT NULL DEFAULT '0' COMMENT '文章是否置顶，0为否，1为是',
              `traffic` int(10) NOT NULL DEFAULT '0' COMMENT '文章访问量',
              `create_time` datetime NOT NULL COMMENT '创建时间',
              `modified_time` datetime NOT NULL COMMENT '修改日期',
              PRIMARY KEY (`id`)
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;   
         
        博客的内容表：article_content
        
             CREATE TABLE `article_content` (
               `id` bigint(40) NOT NULL AUTO_INCREMENT,
               `content` text NOT NULL,
               `article_id` bigint(40) NOT NULL COMMENT '对应文章ID',
               `create_time` datetime NOT NULL COMMENT '创建时间',
               `modifield_time` datetime NOT NULL COMMENT '更新时间',
               PRIMARY KEY (`id`)
             ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
             
             本张表具体存放博客文章的内容，存放博客的主键id进行关联。
             
             
        博客的文章评论表：article_comment ，这是一个关联表，把文章和评论进行关联    
        
            CREATE TABLE `tbl_article_message` (
              `id` bigint(40) NOT NULL AUTO_INCREMENT,
              `article_id` bigint(40) NOT NULL COMMENT '文章ID',
              `comment_id` bigint(40) NOT NULL COMMENT '对应的留言ID',
              `create_time` datetime NOT NULL COMMENT '创建时间',
              `is_effective` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效，默认为1有效，置0无效',
              PRIMARY KEY (`id`)
              
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
            
            
        博客文章的分类表：article_category
        
            CREATE TABLE `article_category` (
              `id` bigint(40) NOT NULL AUTO_INCREMENT,
              `category_id` bigint(40) NOT NULL COMMENT '分类id',
              `article_id` bigint(40) NOT NULL COMMENT '文章id',
              `create_time` datetime NOT NULL COMMENT '创建时间',
              `modified_time` datetime NOT NULL COMMENT '更新时间',
              `is_effective` tinyint(1) DEFAULT '1' COMMENT '表示当前数据是否有效，默认为1有效，0则无效',
              PRIMARY KEY (`id`)
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
            
            这是一个中间表，将博客与评论进行关联
            
            
        博客文章配的图 表：article_picture
        
            CREATE TABLE `article_picture` (
              `id` bigint(40) NOT NULL AUTO_INCREMENT,
              `article_id` bigint(40) NOT NULL COMMENT '对应文章id',
              `picture_url` varchar(100) NOT NULL DEFAULT '' COMMENT '图片url',
              `create_time` datetime NOT NULL COMMENT '创建时间',
              `modified_time` datetime NOT NULL COMMENT '更新时间',
              PRIMARY KEY (`id`)
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='这张表用来保存题图url，每一篇文章都应该有题图';