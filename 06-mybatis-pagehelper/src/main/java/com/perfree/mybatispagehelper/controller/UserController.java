package com.perfree.mybatispagehelper.controller;

import com.perfree.mybatispagehelper.common.PageResult;
import com.perfree.mybatispagehelper.pojo.User;
import com.perfree.mybatispagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO(userController)
 * @Author Perfree
 * @Date 2018/10/3 10:20
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users/{page}/{pageSize}")
    public PageResult<User> getUserByPage(@PathVariable Integer page, @PathVariable Integer pageSize){
        System.out.println(page+"  "+pageSize);
        PageResult<User> result = userService.getUserByPage(page,pageSize);
        return result;
    }
}
