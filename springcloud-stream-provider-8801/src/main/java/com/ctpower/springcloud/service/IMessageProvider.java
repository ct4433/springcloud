package com.ctpower.springcloud.service;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.service
 * @date 2021/3/5 13:39
 * @Copyright www.ctpower.com
 */
public interface IMessageProvider {

    /**
     * 发送接口
     * @param msg
     * @return
     */
    public String send(String msg);

}
