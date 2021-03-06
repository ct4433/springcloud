package com.ctpower.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud
 * @date 2021/3/7 1:54
 * @Copyright www.ctpower.com
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClient_3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClient_3377.class,args);
    }
}
