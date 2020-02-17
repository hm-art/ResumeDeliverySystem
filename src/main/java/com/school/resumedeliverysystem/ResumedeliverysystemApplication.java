package com.school.resumedeliverysystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.school.register.mapper")
public class ResumedeliverysystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumedeliverysystemApplication.class, args);
    }

}
