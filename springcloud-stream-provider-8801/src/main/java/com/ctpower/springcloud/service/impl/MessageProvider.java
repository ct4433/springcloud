package com.ctpower.springcloud.service.impl;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.service.impl
 * @date 2021/3/5 13:40
 * @Copyright www.ctpower.com
 */

import com.ctpower.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import javax.annotation.Resource;

@EnableBinding(Source.class)
public class MessageProvider implements IMessageProvider {
    /**
     * 注入消息发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send(String msg) {
        output.send(MessageBuilder.withPayload(msg).build());
        System.out.println("******send message:"+msg);
        return msg;
    }
}