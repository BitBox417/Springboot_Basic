package com.ethan.springboot_basic.service;

import com.ethan.springboot_basic.pojo.User;
import com.ethan.springboot_basic.pojo.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {

    User add(UserDto user);
}
