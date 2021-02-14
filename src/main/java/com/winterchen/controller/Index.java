package com.winterchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Index {

     @PostMapping(value = {"", "/login"})
     public String begin(){
          return "redirect:view/login.html";
     }

}
