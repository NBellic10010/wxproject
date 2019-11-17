package com.wx.client;

import com.wx.mappers.UserInterests;
import com.wx.mappers.UserInterestsKey;

public interface UserInterestsMapper {
    int deleteByPrimaryKey(UserInterestsKey key);

    int insert(UserInterests record);

    int insertSelective(UserInterests record);

    UserInterests selectByPrimaryKey(UserInterestsKey key);

    int updateByPrimaryKeySelective(UserInterests record);

    int updateByPrimaryKey(UserInterests record);
}