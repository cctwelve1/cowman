package com.practice.cowman.service;

import com.practice.cowman.dao.UserMapper;
import com.practice.cowman.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User findUserById(int id)
    {
        return userMapper.selectById(id);
    }

}
