package com.etoak.service.impl;

import com.etoak.bean.Page;
import com.etoak.bean.User;
import com.etoak.mapper.UserMapper;
import com.etoak.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 19161 on 2020/8/18.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Page<User> queryList(int pageNum, int pageSize, User user) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList=userMapper.queryList(user);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return new Page<User>(pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                userList,
                pageInfo.getTotal(),
                pageInfo.getPages());
    }
    @Override
    public Page<User> queryList2(int pageNum, int pageSize, User user) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList=userMapper.queryList(user);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return new Page<User>(pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                userList,
                pageInfo.getTotal(),
                pageInfo.getPages());
    }


    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
