package com.ethan.springboot_basic.controller;

import com.ethan.springboot_basic.pojo.ResponseMessage;
import com.ethan.springboot_basic.pojo.User;
import com.ethan.springboot_basic.pojo.dto.UserDto;
import com.ethan.springboot_basic.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController //街口返回對象轉成json
@RequestMapping("/user")  //訪問localhost:8080/user/**
public class UserControler {
    @Autowired
    IUserService userService;

    //新增
    @PostMapping  //URL: localhost:8088/user  method: post
    public ResponseMessage add(@Validated @RequestBody UserDto user ) {
       User userAdd = userService.add(user);


        return ResponseMessage.success(userAdd);

    }

    //查詢
    @GetMapping("/{userid}")  //URL: localhost:8088/user/1   method: get
    public ResponseMessage get(@PathVariable Integer userid) {
        User userNew = userService.getUser(userid);


        return ResponseMessage.success(userNew);

    }

    //修改
    @PutMapping
    public ResponseMessage edit(@Validated @RequestBody UserDto user ) {
        User userAdd = userService.edit(user);


        return ResponseMessage.success(userAdd);

    }

    //刪除
    @DeleteMapping("/{userId}")
    public ResponseMessage delete(@PathVariable Integer userId) {
        userService.delete(userId);
        return ResponseMessage.success(null);
    }
}
