package com.qs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qs.mapper")
public class QsMain8200 {

    public static void main(String[] args) {
        SpringApplication.run(QsMain8200.class, args);
    }
}
