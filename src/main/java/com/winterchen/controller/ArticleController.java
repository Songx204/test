package com.winterchen.controller;


import com.winterchen.service.arcitle.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {
     @Autowired
     private ArticleService articleService;


     @GetMapping(value = "/all")
     public Object findAllArticle(String string){
          System.out.println(string);
          return articleService.findAllarticle();
     }
}
