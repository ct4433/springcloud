package com.ctpower.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud
 * @date 2021/2/25 16:12
 * @Copyright www.ctpower.com
 */
@SpringBootApplication
@EnableEurekaClient //在服务启动后自动注册到Eureka中
@EnableDiscoveryClient
@EnableCircuitBreaker//添加对熔断的支持
public class DeptProvider_8081 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8081.class,args);
    }
}
