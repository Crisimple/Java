package com.secoder.test_diy_starter;

import com.secoder.secoder_spring_boot_starter_autoconfigure.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author crisimple
 * @File HelloController
 * @Time 2021-04-24 23:36
 * @Description
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    public String hello(){
        return helloService.sayHello("test");
    }


}
