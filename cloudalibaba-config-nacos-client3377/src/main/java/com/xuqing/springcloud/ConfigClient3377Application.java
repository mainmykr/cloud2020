package com.xuqing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuqing
 * @description
 * @create 2020/04/13 22:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient3377Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3377Application.class,args);
    }
}
