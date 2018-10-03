package com.perfree.druid.mapper;

import com.perfree.druid.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id,name,age from user where id=#{id}")
    User getUserById(int id);
}
