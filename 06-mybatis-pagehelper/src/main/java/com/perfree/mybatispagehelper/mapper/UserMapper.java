package com.perfree.mybatispagehelper.mapper;

import com.perfree.mybatispagehelper.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO(UserMapper 接口)
 * @Author Perfree
 * @Date 2018/10/3 10:24
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    List<User> getAllUser();
}
