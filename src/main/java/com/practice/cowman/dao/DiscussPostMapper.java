package com.practice.cowman.dao;

import com.practice.cowman.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit); //offset 起始页  Limit最多显示页数多少

    //@Param  注解给参数起别别名
    //如果只有一个参数，并且<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);//@Param("userid")



}
