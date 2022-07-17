package com.example.springcloud.dao;

import com.example.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 成大事
 * @since 2022/7/17 13:19
 */
@Mapper
public interface PaymentDao {
    /**
     * 插入操作
     * @param payment  实体
     * @return 受影响的行数
     */
    int create(Payment payment);

    /**
     * 通过id查订单
     * @param id  订单id
     * @return  订单
     */
    Payment getPaymentById(@Param("id") Long id);
}
