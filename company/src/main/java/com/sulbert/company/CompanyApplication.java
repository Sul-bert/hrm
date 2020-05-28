package com.sulbert.company;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: Sulbert
 * Date: 2020/5/18
 * Description: 启动类
 */
@SpringBootApplication
@MapperScan("com.sulbert.company")
public class CompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class,args);
    }
}