package com.example.springcloud.alibaba.controller;

import com.example.springcloud.alibaba.domain.CommonResult;
import com.example.springcloud.alibaba.domain.Order;
import com.example.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 成大事
 * @since 2022/7/21 11:58
 */
@RestController
public class OrderController{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
