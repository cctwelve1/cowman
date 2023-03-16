package com.practice.cowman.dao;

import com.practice.cowman.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectById(int id);  //字段查询

    User selectByName(String username); //名字查询

    User selectByEmail(String email);  //邮件查询

    int insertUser(User user);  //插入数据

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
