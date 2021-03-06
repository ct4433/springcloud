package com.ctpower.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.controller
 * @date 2021/3/6 14:07
 * @Copyright www.ctpower.com
 */


@RestController
@Slf4j
public class DeptNacosController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;


    @GetMapping(value = "/nacos/consumer/{id}")
    public String getDeptInfo(@PathVariable("id") Long id){

        String url = serverURL + "/nacos/"+id ;

        System.out.println(url);

        return restTemplate.getForObject(serverURL+"/nacos/"+id,String.class);
//        return serverURL;
    }


}
