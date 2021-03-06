package com.ctpower.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud
 * @date 2021/3/6 13:37
 * @Copyright www.ctpower.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosApplication_9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosApplication_9001.class,args);
    }
}
