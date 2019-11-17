package com.wx.mappers;

public class GamesKey {
    private Integer gameId;

    private String gameName;

    private String gameNameEng;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public String getGameNameEng() {
        return gameNameEng;
    }

    public void setGameNameEng(String gameNameEng) {
        this.gameNameEng = gameNameEng == null ? null : gameNameEng.trim();
    }
}