package com.wubao.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @Value("${test.hello:This is default}")
    private String testHello;

    @RequestMapping("/hello")
    public String say_hello(){
        return "Hello World!"+testHello;
    }

    @RequestMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post,"+name;
    }
}
