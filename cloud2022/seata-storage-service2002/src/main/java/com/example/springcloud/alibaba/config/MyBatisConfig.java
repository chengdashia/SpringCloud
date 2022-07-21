package com.example.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 成大事
 * @since 2022/7/21 11:59
 */
@Configuration
@MapperScan({"com.example.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
