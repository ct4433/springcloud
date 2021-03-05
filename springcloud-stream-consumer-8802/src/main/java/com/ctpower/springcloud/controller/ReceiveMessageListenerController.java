package com.ctpower.springcloud.controller;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.controller
 * @date 2021/3/5 13:58
 * @Copyright www.ctpower.com
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {
    /**
     * 获取本服务的端口
     */
    @Value("${server.port}")
    private String serverPort;
    /**
     * 这里表示监听sink的input
     * @param message
     */
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("**** recv msg :"+message.getPayload()+"   in port "+serverPort);
    }
}
