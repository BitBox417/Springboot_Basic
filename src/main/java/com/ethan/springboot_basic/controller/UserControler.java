package com.ethan.springboot_basic.controller;

import com.ethan.springboot_basic.pojo.dto.UserDto;
import com.ethan.springboot_basic.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //街口返回對象轉成json
@RequestMapping("/user")  //訪問localhost:8080/user/**
public class UserControler {
    @Autowired
    IUserService userService;

    //新增
    @PostMapping  //URL: localhost:8080/user  method: post
    public String add(@RequestBody UserDto user ) {
        userService.add(user);


        return "success!";

    }

    //查詢

    //修改

    //刪除
}
