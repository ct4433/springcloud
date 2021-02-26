package com.ctpower.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud
 * @date 2021/2/25 18:45
 * @Copyright www.ctpower.com
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ctpower.springcloud"})
public class DeptConsumer_80_feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80_feign.class,args);
    }
}