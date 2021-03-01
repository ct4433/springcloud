package com.ctpower.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud
 * @date 2021/2/28 1:02
 * @Copyright www.ctpower.com
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication_3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication_3344.class,args);
    }
}
