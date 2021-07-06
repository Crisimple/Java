package com.secoder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author crisimple
 * @File HelloController
 * @Time 2021-04-18 15:13
 * @Description
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    private String hello(){
        return "Hello Controller";
    }

}
