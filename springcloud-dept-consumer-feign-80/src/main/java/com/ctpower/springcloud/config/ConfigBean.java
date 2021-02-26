package com.ctpower.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.config
 * @date 2021/2/25 18:44
 * @Copyright www.ctpower.com
 */
@Configuration
public class ConfigBean {   //Cofiguration -- spring applicationContext.xml

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}