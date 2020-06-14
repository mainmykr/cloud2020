package com.xuqing.springcloud.service.impl;

import com.xuqing.springcloud.dao.PaymentDao;
import com.xuqing.springcloud.entities.Payment;
import com.xuqing.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xuqing
 * @description
 * @create 2020/03/25 1:30
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired(required = false)
    private PaymentDao paymentDao;
    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentDao.getById(id);
    }
}
