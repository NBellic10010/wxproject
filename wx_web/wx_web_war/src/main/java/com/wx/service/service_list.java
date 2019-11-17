package com.wx.service;

import com.wx.mappers.Games;
import com.wx.mappers.GamesKey;
import com.wx.mappers.Prices;

import java.util.List;

public interface service_list {
    public Games getSingle_Game(GamesKey key);
    //public List<Games> get_Games_Trie
    public int deleteSingle_Game(GamesKey key);
    public int deleteGames(List<GamesKey> gamesKeyList);
    public int insertGames(List<Games> gamesList);
    public int insertSingle_Game(Games newgame);
    public int updateSingle_Game(GamesKey key, Games alter);
    public int updateGames(List<GamesKey> key, List<Games> alter);
    public List<Prices> getPriceInfo(Games games);
    public int clearOldPrice();


}
