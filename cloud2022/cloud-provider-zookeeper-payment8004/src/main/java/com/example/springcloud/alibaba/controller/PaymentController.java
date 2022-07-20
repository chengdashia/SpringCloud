package com.example.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 成大事
 * @since 2022/7/17 19:07
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/zk")
    public String paymentZk(){
        return "Springcloud with zookeeper:  "+serverPort +"\t"+ UUID.randomUUID();
    }

}
