package com.wubao.springboot.service;


import com.wubao.springboot.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface userService {
    public User getUser();
}
