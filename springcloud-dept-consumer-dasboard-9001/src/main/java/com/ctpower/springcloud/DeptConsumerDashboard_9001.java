package com.ctpower.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud
 * @date 2021/2/27 4:10
 * @Copyright www.ctpower.com
 */
@SpringBootApplication
@EnableHystrixDashboard //开启
public class DeptConsumerDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9001.class,args);
    }
}