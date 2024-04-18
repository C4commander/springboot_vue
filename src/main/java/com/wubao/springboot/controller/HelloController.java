package com.wubao.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say_hello(){
        return "Hello World!";
    }

    @RequestMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post,"+name;
    }
}
