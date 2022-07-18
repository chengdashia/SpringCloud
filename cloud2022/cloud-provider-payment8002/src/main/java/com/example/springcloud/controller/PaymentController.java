package com.example.springcloud.controller;

import com.example.springcloud.pojo.CommonResult;
import com.example.springcloud.pojo.Payment;
import com.example.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author 成大事
 * @since 2022/7/17 13:34
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String servicePort;

    @PostMapping("/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果*****:"+result);
        if(result > 0){
            return new CommonResult(200,"插入数据库成功,serverPort: "+servicePort,result);
        }
        return new CommonResult(444,"插入数据库失败",result);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult(200,"查询成功,serverPort: "+servicePort,payment);
        }
        return new CommonResult(444,"没有对应的记录，查询id"+id);
    }

    @GetMapping("/lb")
    public String getPaymentLB(){
        return servicePort;
    }

}
