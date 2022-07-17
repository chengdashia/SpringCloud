package com.example.springcloud.controller;

import com.example.springcloud.pojo.CommonResult;
import com.example.springcloud.pojo.Payment;
import com.example.springcloud.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 成大事
 * @since 2022/7/17 13:34
 */
@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果*****:"+result);
        if(result > 0){
            return new CommonResult(200,"插入数据库成功",result);
        }
        return new CommonResult(444,"插入数据库失败",result);
    }

    @PostMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果*****:"+payment);
        if(payment != null){
            return new CommonResult(200,"查询成功12",payment);
        }
        return new CommonResult(444,"没有对应的记录，查询id"+id);
    }

}
