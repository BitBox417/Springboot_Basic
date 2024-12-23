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

    @Override
    public User getUser(Integer userId) {
       return userRepository.findById(userId).orElseThrow(() -> {
           try {
               throw new IllegalAccessException("用戶不存在,參數異常");
           } catch (IllegalAccessException e) {
               throw new RuntimeException(e);
           }
       });


    }

    @Override
    public User edit(UserDto user) {

        User userPojo=new User();

        BeanUtils.copyProperties(user,userPojo);  //將UserDto複製到User


        return userRepository.save(userPojo);
    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
    }
}
