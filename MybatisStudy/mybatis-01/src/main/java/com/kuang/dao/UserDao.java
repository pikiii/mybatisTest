package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserDao{
    //获取全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //insert 一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);
}
