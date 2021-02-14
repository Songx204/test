package com.winterchen.controller;

import com.alibaba.fastjson.JSONObject;
import com.winterchen.service.catagory.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/catagory/*",method = {RequestMethod.GET,RequestMethod.POST})
public class CatagoryContorller {
     
     @Autowired
     private CatagoryService catagoryService;

     @ResponseBody
     @PostMapping("/all")
     public Object findAllCategory(){
          return catagoryService.findAllCategory();
     }



}
