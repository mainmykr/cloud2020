package com.xuqing.springcloud.controller;

import com.xuqing.springcloud.entities.CommonResult;
import com.xuqing.springcloud.entities.Payment;
import com.xuqing.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author xuqing
 * @description
 * @create 2020/03/25 20:15
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id){
        Payment payment = paymentService.getById(id);
        if (payment != null){
            return new CommonResult(200,"success in " + port ,payment);
        }else{
            return new CommonResult(404,"not found");
        }
    }
    @PostMapping("/add")
    public CommonResult insert(@RequestBody Payment payment){
        int result = paymentService.insert(payment);
        if (result > 0){
            return new CommonResult(200,"success",payment);
        }else{
            return new CommonResult(500,"error");
        }
    }

}
