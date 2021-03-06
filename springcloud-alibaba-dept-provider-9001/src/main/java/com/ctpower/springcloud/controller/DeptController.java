package com.ctpower.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.controller
 * @date 2021/3/6 13:39
 * @Copyright www.ctpower.com
 */
@RestController
public class DeptController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/nacos/{id}")
    public String getDept(@PathVariable("id") Integer id){
        return "nacos registry,serverPort: " + serverPort + "\t id" + id;
    }

}
