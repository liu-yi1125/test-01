package com.etoak;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 19161 on 2020/8/18.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.etoak.mapper")
public class Test {
    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }
}
