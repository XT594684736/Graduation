package com.xiaofd.graduation;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScans(
        @MapperScan("com.xiaofd.graduation.mapper")
//       , @MapperScan("com.xiaofd.graduation.mapper.ex")
)
public class GraduationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduationApplication.class, args);
    }

}
