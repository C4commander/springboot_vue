package com.wubao.springboot.controller;

import com.wubao.springboot.entity.User;
import com.wubao.springboot.service.userService;
import org.springframework.stereotype.Controller;

@Controller
public class userController {
    userService userService = new userService() {
        @Override
        public User getUser() {
            return null;
        }
    };
}
