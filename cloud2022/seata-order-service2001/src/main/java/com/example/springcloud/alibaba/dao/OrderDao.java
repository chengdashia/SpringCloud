package com.example.springcloud.alibaba.dao;

import com.example.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 成大事
 * @since 2022/7/21 13:04
 */
@Mapper
public interface OrderDao{
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
