package com.winterchen.controller;

import com.alibaba.fastjson.JSONObject;
import com.winterchen.common.Message;
import com.winterchen.common.Result;
import com.winterchen.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(){
        return userService.findAllUser();
    }

    @ResponseBody
    @PostMapping(value = "/update", produces = "application/json;charset=utf-8")
    public Result update(@RequestBody  JSONObject json){
        String name = json.getString("oldPassword");
        return new Result(200,Message.SUCCESS,1);
    }

}
