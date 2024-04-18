package com.wubao.springboot.controller;

import com.wubao.springboot.entity.Student;
import com.wubao.springboot.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {
    userService userService = new userService() {
        @Override
        public Student getUser() {
            return null;
        }
    };
}
