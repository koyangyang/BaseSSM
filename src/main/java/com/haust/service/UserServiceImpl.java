package com.haust.service;

import com.haust.dao.UserMapper;

public class UserServiceImpl {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
