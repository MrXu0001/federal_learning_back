package com.federal_s.federal_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 开启WebSocket支持
 */
@Configuration  
public class WebSocketConfig {

    @Bean   // 自动注册使用@SererEndPoint注解的
    public ServerEndpointExporter serverEndpointExporter() {  
        return new ServerEndpointExporter();  
    }

} 
