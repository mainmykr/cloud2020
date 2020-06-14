package com.xuqing.springcloud.dao;

import com.xuqing.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xuqing
 * @description
 * @create 2020/03/25 1:08
 */
@Mapper
public interface PaymentDao {
    int insert(Payment payment);
    Payment getById(@Param("id") Long id);

}
