package com.ethan.springboot_basic.service;

import com.ethan.springboot_basic.dao.UserRepository;
import com.ethan.springboot_basic.pojo.User;
import com.ethan.springboot_basic.pojo.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //spring bean
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(UserDto user) {

        User userPojo=new User();

        BeanUtils.copyProperties(user,userPojo);  //將UserDto複製到User

       return userRepository.save(userPojo);

    }
}
