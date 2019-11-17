package com.wx.service;

import com.wx.client.UsersMapper;
import com.wx.mappers.Users;

public class service_user_impl implements service_user {
    private UsersMapper mapper;
    @Override
    public Users getUserById(int openid) {
        return this.mapper.selectByPrimaryKey(openid);
    }

    @Override
    public int createUser(Users newuser) {
        return this.mapper.insert(newuser);
    }

    @Override
    public int deleteUser(int openid) {
        return this.mapper.deleteByPrimaryKey(openid);
    }
}
