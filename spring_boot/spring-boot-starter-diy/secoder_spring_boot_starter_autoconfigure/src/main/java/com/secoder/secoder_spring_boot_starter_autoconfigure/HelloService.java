package com.secoder.secoder_spring_boot_starter_autoconfigure;

/**
 * @Author crisimple
 * @File HelloService
 * @Time 2021-04-24 21:16
 * @Description
 */
public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloPropertie() {
        return helloProperties;
    }

    public void setHelloPropertie(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name){
        return helloProperties.getPrefix() + name + helloProperties.getSuffix();
    }
}
