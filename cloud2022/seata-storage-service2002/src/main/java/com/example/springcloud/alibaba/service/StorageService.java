package com.example.springcloud.alibaba.service;

/**
 * @author 成大事
 * @since 2022/7/21 11:55
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
