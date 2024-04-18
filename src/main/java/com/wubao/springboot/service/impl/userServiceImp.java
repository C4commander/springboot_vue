package com.wubao.springboot.service.impl;

import com.wubao.springboot.entity.Student;
import com.wubao.springboot.service.userService;


public class userServiceImp implements userService {
    @Override
    public Student getUser() {
        return new Student();
    }
}
