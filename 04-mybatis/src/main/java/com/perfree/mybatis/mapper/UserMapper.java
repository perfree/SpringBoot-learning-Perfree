package com.perfree.mybatis.mapper;

import com.perfree.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserServiceImpl
 * @Description TODO(user Mapper接口)
 * @Author Perfree
 * @Date 2018/10/3 7:23
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    //根据用户id查询用户信息
    User getUserById(int id);
}
