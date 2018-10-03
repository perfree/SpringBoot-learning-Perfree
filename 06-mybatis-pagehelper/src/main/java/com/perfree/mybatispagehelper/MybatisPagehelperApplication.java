package com.perfree.mybatispagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.perfree.mybatispagehelper.mapper.UserMapper")
@SpringBootApplication
public class MybatisPagehelperApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisPagehelperApplication.class, args);
    }

}
