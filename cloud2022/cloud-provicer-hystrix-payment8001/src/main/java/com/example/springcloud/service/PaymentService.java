package com.example.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author 成大事
 * @since 2022/7/18 15:58
 */
@Service
public class PaymentService {
    /**
     * 正常访问  ok
     * @param id  id
     * @return  字符串
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池:  "+Thread.currentThread().getName()+"  paymentInfo_OK,id:  "+id+"\t"+"O(∩_∩)O哈哈~";
    }

    /**
     * 超时访问  error
     * @param id  id
     * @return  字符串
     */
    public String paymentInfo_TimeOut(Integer id) {
        try { TimeUnit.MILLISECONDS.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池:  "+Thread.currentThread().getName()+" id:  "+id+"\t"+"O(∩_∩)O哈哈~"+"  耗时(秒): 3";
    }
}
