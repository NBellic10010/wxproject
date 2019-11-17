package com.wx.client;

import com.wx.mappers.Games;
import com.wx.mappers.GamesKey;

public interface GamesMapper {
    int deleteByPrimaryKey(GamesKey key);

    int insert(Games record);

    int insertSelective(Games record);

    Games selectByPrimaryKey(GamesKey key);

    int updateByPrimaryKeySelective(Games record);

    int updateByPrimaryKeyWithBLOBs(Games record);

    int updateByPrimaryKey(Games record);
}