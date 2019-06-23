package com.ayyovei.spring.boot.docker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/6/23
 */
@RestController
public class HomeController {
    @RequestMapping("/hello")
    public String hello(String message) {
        return String.format("hollo,message is : %s", message);
    }
}
