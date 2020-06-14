package com.xuqing.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuqing
 * @description
 * @create 2020/04/13 22:43
 * RefreshScope //支持nacosde 动态刷新
 */
@RestController
@RefreshScope //config配置中心自动刷新
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
