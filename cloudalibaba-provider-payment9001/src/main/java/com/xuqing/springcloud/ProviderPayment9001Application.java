package com.xuqing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuqing
 * @description
 * @create 2020/04/08 1:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayment9001Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment9001Application.class,args);
    }
}
