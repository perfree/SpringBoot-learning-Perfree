package com.perfree.mybatisannotation.controller;

import com.perfree.mybatisannotation.pojo.User;
import com.perfree.mybatisannotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO(userController)
 * @Author Perfree
 * @Date 2018/10/3 8:41
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUserById(){
        User user = userService.getUserById(2);
        return user.getName();
    }
}
