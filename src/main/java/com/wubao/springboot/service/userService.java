package com.wubao.springboot.service;


import com.wubao.springboot.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface userService {
    public Student getUser();
}
