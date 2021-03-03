package com.ctpower.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.controller
 * @date 2021/2/28 22:09
 * @Copyright www.ctpower.com
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationNanme;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;
    @Value("${hello}")
    private String hello;

    @RequestMapping("/config")
    @ResponseBody
    public String getConfig(){

        return
                "applicationName:" + applicationNanme +
                "eurekaServer:"+eurekaServer +
                "port:"+ port +
                "hello:" + hello;

    }


}
