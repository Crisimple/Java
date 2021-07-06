package com.secoder.secoder_spring_boot_starter_autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author crisimple
 * @File HelloServiceAutoConfiguration
 * @Time 2021-04-24 23:17
 * @Description
 */
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setHelloPropertie(helloProperties);
        return helloService;
    }
}
