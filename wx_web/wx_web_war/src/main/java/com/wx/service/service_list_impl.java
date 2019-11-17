package com.wx.service;

import com.wx.client.GamesMapper;
import com.wx.client.PricesMapper;
import com.wx.mappers.Games;
import com.wx.mappers.GamesKey;
import com.wx.mappers.Prices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class service_list_impl implements service_list {
    @Autowired
    private GamesMapper gamemapper;
    private PricesMapper pricemapper;

    @Override
    public Games getSingle_Game(GamesKey key) {
        return this.gamemapper.selectByPrimaryKey(key);
        //return null;
    }
    @Override
    public List<Prices> getPriceInfo(Games games) {
        //Prices prices = new Prices();
        List<Prices> price_record = this.pricemapper.selectByGameId(games.getGameId());
        return price_record;
    }
    @Override
    public int clearOldPrice() {
        Calendar pre = Calendar.getInstance();
        pre.add(Calendar.DAY_OF_YEAR, -8);
        Date pre_date = pre.getTime();
        int i = this.pricemapper.deleteByDate(pre_date);
        return i;
    }
    @Override
    public int deleteSingle_Game(GamesKey key){
        return this.gamemapper.deleteByPrimaryKey(key);
    }
    @Override
    public int deleteGames(List<GamesKey> gamesKeyList){
        for(GamesKey k: gamesKeyList) {
            int status = deleteSingle_Game(k);
        }
        return 0;
    }
    @Override
    public int insertGames(List<Games> gamesList){
        for(Games g: gamesList) {
            int status = insertSingle_Game(g);
        }
        return 0;
    }
    @Override
    public int insertSingle_Game(Games newgame){
        int status = this.gamemapper.insert(newgame);
        return status;
    }
    @Override
    public int updateSingle_Game(GamesKey key, Games alter){
        int status = this.gamemapper.updateByPrimaryKeyWithBLOBs(alter);
        return status;
    }
    @Override
    public int updateGames(List<GamesKey> key, List<Games> alter){
        for(Games g: alter) {
            int status = insertSingle_Game(g);
        }
        return 0;
    }

}
