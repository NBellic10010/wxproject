package com.wx.mappers;

import java.util.Date;

public class PricesKey {
    private Integer gameId;

    private Date date;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}