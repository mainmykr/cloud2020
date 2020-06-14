package com.xuqing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuqing
 * @description
 * @create 2020/04/12 21:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrder83Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder83Application.class,args);
    }
}
