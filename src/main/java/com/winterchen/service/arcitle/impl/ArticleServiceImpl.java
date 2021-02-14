package com.winterchen.service.arcitle.impl;

import com.winterchen.dao.ArticleDao;
import com.winterchen.model.ArticleDomain;
import com.winterchen.service.arcitle.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "articleService")
public class ArticleServiceImpl implements ArticleService{

     @Autowired
     private ArticleDao articleDao;
     @Override
     public List<ArticleDomain> findAllarticle() {
          return articleDao.selectArticle();
     }
}
