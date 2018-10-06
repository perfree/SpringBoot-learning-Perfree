package com.perfree.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试jsp Controller控制层
 */
@Controller
public class JspController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
