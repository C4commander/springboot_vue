package com.wubao.springboot_vue.service;


import com.wubao.springboot_vue.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface userService {
    public User getUser();
}
