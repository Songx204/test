package com.winterchen.service.catagory.impl;

import com.winterchen.dao.CategoryDao;
import com.winterchen.model.Category;
import com.winterchen.service.catagory.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "catagoryService")
public class CatagoryServiceImpl implements CatagoryService{
     @Autowired
     private CategoryDao categoryDao;
     @Override
     public List<Category> findAllCategory() {
          return categoryDao.selectCategory();
     }
}
