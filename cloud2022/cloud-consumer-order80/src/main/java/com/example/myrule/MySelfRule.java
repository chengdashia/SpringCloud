package com.example.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 成大事
 * @since 2022/7/17 22:44
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule muRule(){
        //定义为随机
        return new RandomRule();
    }
}
