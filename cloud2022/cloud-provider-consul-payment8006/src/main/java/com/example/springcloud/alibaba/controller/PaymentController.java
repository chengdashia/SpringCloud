package com.example.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 成大事
 * @since 2022/7/17 21:34
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/consul")
    public String paymentZk(){
        return "SpringCloud with consul:  "+serverPort +"\t"+ UUID.randomUUID();
    }
}
