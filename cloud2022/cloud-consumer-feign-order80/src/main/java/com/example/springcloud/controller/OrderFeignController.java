package com.example.springcloud.controller;

import com.example.springcloud.pojo.CommonResult;
import com.example.springcloud.pojo.Payment;
import com.example.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 成大事
 * @since 2022/7/18 15:05
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    /**
     * 通过id查订单
     * @param id  订单id
     * @return  订单
     */
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeOut(){
        //openfeign ,客户端一般默认等待一秒钟
        return paymentFeignService.paymentFeignTimeOut();
    }


}
