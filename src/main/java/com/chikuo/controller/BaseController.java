package com.chikuo.controller;

import com.chikuo.service.ArticleService;
import com.chikuo.service.CategoryService;
import com.chikuo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

    @Autowired
    ArticleService articleService;

    @Autowired
    CommentService commentService;

    @Autowired
    CategoryService categoryService;

}
