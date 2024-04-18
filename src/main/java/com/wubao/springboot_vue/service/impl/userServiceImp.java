package com.wubao.springboot_vue.service.impl;

import com.wubao.springboot_vue.entity.User;
import com.wubao.springboot_vue.service.userService;


public class userServiceImp implements userService {
    @Override
    public User getUser() {
        return new User();
    }
}
