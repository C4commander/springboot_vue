package com.wubao.springboot.service.impl;

import com.wubao.springboot.entity.User;
import com.wubao.springboot.service.userService;


public class userServiceImp implements userService {
    @Override
    public User getUser() {
        return new User();
    }
}
