package com.example.springcloud.alibaba.service;

import com.example.springcloud.pojo.CommonResult;
import com.example.springcloud.pojo.Payment;
import org.springframework.stereotype.Component;

/**
 * @author 成大事
 * @since 2022/7/21 9:58
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id){
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
