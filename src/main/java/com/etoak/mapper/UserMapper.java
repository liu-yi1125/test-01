package com.etoak.mapper;

import com.etoak.bean.User;

import java.util.List;

/**
 * Created by 19161 on 2020/8/18.
 */
public interface UserMapper {
    //添加
    int addUser(User user);
    // 管理员  分页
    List<User>queryList(User user);
    // 普通  分页
    List<User>queryList2(User user);
    //更新
    int updateUser(User user);
}
