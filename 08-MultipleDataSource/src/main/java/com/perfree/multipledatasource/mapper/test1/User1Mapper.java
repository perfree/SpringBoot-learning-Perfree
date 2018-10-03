package com.perfree.multipledatasource.mapper.test1;

import com.perfree.multipledatasource.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * User1 Mapper接口
 */
@Mapper
public interface User1Mapper {
    //根据用户id查询用户信息
    User getUserById(int id);
}
