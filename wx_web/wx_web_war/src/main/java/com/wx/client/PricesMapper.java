package com.wx.client;

import com.wx.mappers.Prices;
import com.wx.mappers.PricesKey;

import java.util.Date;
import java.util.List;

public interface PricesMapper {
    int deleteByPrimaryKey(PricesKey key);

    int insert(Prices record);

    int insertSelective(Prices record);

    Prices selectByPrimaryKey(PricesKey key);

    int updateByPrimaryKeySelective(Prices record);

    int updateByPrimaryKey(Prices record);

    List<Prices> selectByGameId(Integer gameid);

    int deleteByDate(Date date);

}