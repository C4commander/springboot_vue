package com.wubao.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class Student {
    private String id;
    private String studentName;
    private String userName;
    private String password;
    private String avatar;
    private Boolean sex;

    private String birthday;
    private String email;
    private String phoneNumber;


    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private String createTime;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private String updateTime;
}
