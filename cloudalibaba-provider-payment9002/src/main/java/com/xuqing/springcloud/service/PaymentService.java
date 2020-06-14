package com.xuqing.springcloud.service;

import com.xuqing.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * payment接口
 * @author xuqing
 */
public interface PaymentService {
    /**
     * 插入
     * @param payment
     * @return
     */
    int insert(Payment payment);

    /**
     * 通过ID获取
     * @param id
     * @return
     */
    Payment getById(@Param("id") Long id);
}
