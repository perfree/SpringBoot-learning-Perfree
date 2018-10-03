package com.perfree.multipledatasource.mapper.test2;

import com.perfree.multipledatasource.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * User2 Mapper接口
 */
@Mapper
public interface User2Mapper {

    //根据用户id查询用户信息
    User getUserById(int id);
}
