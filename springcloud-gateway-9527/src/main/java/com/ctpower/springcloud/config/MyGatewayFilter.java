package com.ctpower.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.config
 * @date 2021/2/26 17:07
 * @Copyright www.ctpower.com
 */
//@Configuration
@Slf4j
public class MyGatewayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        log.info("################ 全局Gateway 过滤器开始工作 ###############");
        HttpHeaders headers = exchange.getRequest().getHeaders();
        //需求操作
        if (headers.containsKey("X-Access-Token")){
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}