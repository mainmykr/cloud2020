package com.xuqing.springcloud.controller;

import com.xuqing.springcloud.entities.CommonResult;
import com.xuqing.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuqing
 * @description
 * @create 2020/04/12 21:37
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-payment-service-url}")
    private String NACOS_PAYMENT_SERVICE_URL;

    @PostMapping("/payment/add")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(NACOS_PAYMENT_SERVICE_URL+"/payment/add",payment, CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(NACOS_PAYMENT_SERVICE_URL+"/payment/get/"+id,CommonResult.class);
    }
}
