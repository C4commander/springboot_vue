package com.wubao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootVueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootVueApplication.class, args);
    }

}
