package com.ctpower.springcloud.service.controller;

import com.ctpower.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.service.controller
 * @date 2021/3/5 13:42
 * @Copyright www.ctpower.com
 */

@RestController
public class TestController {

    @Autowired
    IMessageProvider messageProvider;

    @GetMapping("/sendMsg")
    public String sendMsg(){
        String msg = UUID.randomUUID().toString();
        return messageProvider.send(msg);
    }

}