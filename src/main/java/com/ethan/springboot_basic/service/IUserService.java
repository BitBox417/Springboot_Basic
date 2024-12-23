package com.ethan.springboot_basic.service;

import com.ethan.springboot_basic.pojo.User;
import com.ethan.springboot_basic.pojo.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {


    /**
     * 新增用戶
     * @param user 參數
     * @return
     */
    User add(UserDto user);


    /**
     * 插尋用戶
     * @param userId 用戶ID
     * @return
     */
    User getUser(Integer userId);


    /**
     * 修改用戶
     * @param user 修e92用戶對象
     * @return
     */
    User edit(UserDto user);


    /**
     * 刪除
     *
     * @param userId
     */
    void delete(Integer userId);

}
