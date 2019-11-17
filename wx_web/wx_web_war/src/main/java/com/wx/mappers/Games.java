package com.wx.mappers;

import java.util.Date;

public class Games extends GamesKey {
    private String steamLink;

    private Boolean gameStatus;

    private Date updateDate;

    private String gameIntro;

    public String getSteamLink() {
        return steamLink;
    }

    public void setSteamLink(String steamLink) {
        this.steamLink = steamLink == null ? null : steamLink.trim();
    }

    public Boolean getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(Boolean gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getGameIntro() {
        return gameIntro;
    }

    public void setGameIntro(String gameIntro) {
        this.gameIntro = gameIntro == null ? null : gameIntro.trim();
    }
}