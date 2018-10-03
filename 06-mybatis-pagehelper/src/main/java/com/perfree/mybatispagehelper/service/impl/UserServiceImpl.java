package com.perfree.mybatispagehelper.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.perfree.mybatispagehelper.common.PageResult;
import com.perfree.mybatispagehelper.mapper.UserMapper;
import com.perfree.mybatispagehelper.pojo.User;
import com.perfree.mybatispagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO(UserService 实现)
 * @Author Perfree
 * @Date 2018/10/3 10:24
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageResult<User> getUserByPage(Integer page, Integer pageSize) {
        //设置起始页，每页显示的数量
        PageHelper.startPage(page,pageSize);
        //查询
        List<User> list = userMapper.getAllUser();
        //将查询的结果给pageinfo处理
        PageInfo<User> pageInfo = new PageInfo<>(list);
        //创建结果集对象
        PageResult<User> result = new PageResult<>();
        //将结果封装到结果集对象中
        //当前页
        result.setPage(page);
        //每页的数量
        result.setPageSize(pageInfo.getPageSize());
        //总页数
        result.setPageTotal(pageInfo.getPages());
        //总条数
        result.setTotal(pageInfo.getTotal());
        //结果集
        result.setList(pageInfo.getList());
        return result;
    }
}
