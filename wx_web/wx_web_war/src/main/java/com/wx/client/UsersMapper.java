package com.wx.client;

import com.wx.mappers.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer openId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer openId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKeyWithBLOBs(Users record);

    int updateByPrimaryKey(Users record);
}