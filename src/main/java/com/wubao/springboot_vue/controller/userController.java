package com.wubao.springboot_vue.controller;

import com.wubao.springboot_vue.entity.User;
import com.wubao.springboot_vue.service.userService;
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
