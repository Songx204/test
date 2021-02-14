package com.winterchen.dao;

import com.winterchen.model.ArticleDomain;

import java.util.List;

public interface ArticleDao {

     List<ArticleDomain> selectArticle();
}
