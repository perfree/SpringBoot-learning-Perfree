package com.perfree.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description TODO(controller)
 * @Author Perfree
 * @Date 2018/10/2 21:15
 * @Version 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","Perfree");
        return "hello";
    }
}
