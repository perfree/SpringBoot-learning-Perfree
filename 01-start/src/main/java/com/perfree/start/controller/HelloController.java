package com.perfree.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO(controller)
 * @Author Perfree
 * @Date 2018/10/2 20:18
 * @Version 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello SpringBoot";
    }
}
