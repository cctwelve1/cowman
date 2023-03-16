package com.practice.cowman.service;


import com.practice.cowman.dao.DiscussPostMapper;
import com.practice.cowman.entity.DiscussPost;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscussPostService {

    @Resource
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost>  findDiscussPosts(int userId,int offset,int limit)
    {
        return discussPostMapper.selectDiscussPosts(userId,offset,limit);
    }

    public int findDiscussPostRows(int userId) //查找行数
    {
        return discussPostMapper.selectDiscussPostRows(userId);
    }

}
