package com.example.kong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@MapperScan(basePackages = "com.example.kong.mapper")
public class KongClassApplication {
    public static void main(String[] args) {
        SpringApplication.run(KongClassApplication.class, args);
    }
}

