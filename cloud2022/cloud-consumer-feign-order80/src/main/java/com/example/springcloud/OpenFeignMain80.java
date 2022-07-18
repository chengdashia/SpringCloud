package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 成大事
 * @since 2022/7/18 14:58
 */
@EnableFeignClients
@SpringBootApplication
public class OpenFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignMain80.class,args);
    }
}
