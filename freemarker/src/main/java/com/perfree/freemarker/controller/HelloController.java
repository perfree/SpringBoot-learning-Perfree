package com.perfree.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO(Hello Freemarker!)
 * @Author Perfree
 * @Date 2018/10/2 18:58
 * @Version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String helloFreemarker(Model model){
        model.addAttribute("name","Perfree");
        List<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        model.addAttribute("names",names);
        return "hello";
    }
}
