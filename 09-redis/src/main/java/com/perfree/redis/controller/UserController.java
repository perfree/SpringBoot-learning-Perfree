package com.perfree.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 *User Controller
 */
@RestController
public class UserController {

    @Autowired
    private RedisTemplate redisTemplate;

    //key-val形式将名字放入redis
    @RequestMapping("/setName")
    public String setName(){
        redisTemplate.opsForValue().set(2,"张三");
        return "success";
    }

    //key-val形式根据key获取名字
    @RequestMapping("/getName")
    public String getUserNameById(){
        String name = (String) redisTemplate.opsForValue().get(2);
        return name;
    }

    //存入redis并设置过期时间
    @RequestMapping("/setNameAndOutTime")
    public String setNameAndOutTime(){
        redisTemplate.opsForValue().set(3,"王二",20, TimeUnit.SECONDS);
        return "success";
    }

    //取出存入的设置过期时间的name，20秒之内可以，20秒之后为null
    @RequestMapping("/getNameAndOutTime")
    public String getNameAndOutTime(){
        String name = (String) redisTemplate.opsForValue().get(3);
        return name;
    }
}
