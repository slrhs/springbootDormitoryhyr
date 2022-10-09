package com.hyr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hyr.mapper")
public class SpringbootDormitoryhyrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDormitoryhyrApplication.class, args);
    }

}
