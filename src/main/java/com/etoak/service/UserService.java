package com.etoak.service;

import com.etoak.bean.Page;
import com.etoak.bean.User;

/**
 * Created by 19161 on 2020/8/18.
 */
public interface UserService {
    //添加
    int addUser(User user);
    //分页
    Page<User>queryList(int pageNum,int pageSize,User user);
    Page<User>queryList2(int pageNum,int pageSize,User user);
    //更新
    int updateUser(User user);
}
