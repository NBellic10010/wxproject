package com.wx.service;

import com.wx.mappers.Users;
import org.springframework.stereotype.Service;

@Service("user_service")
public interface service_user {
    public Users getUserById(int openid);
    public int createUser(Users newuser);
    public int deleteUser(int openid);

    public int isValidUser(int openid);

}
