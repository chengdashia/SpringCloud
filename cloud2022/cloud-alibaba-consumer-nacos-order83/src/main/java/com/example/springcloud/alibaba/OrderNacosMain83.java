package com.example.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 成大事
 * @since 2022/7/20 13:07
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83{
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain83.class,args);
    }
}
