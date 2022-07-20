package com.example.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 成大事
 * @since 2022/7/20 13:33
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377{
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }
}
