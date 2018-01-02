package com.lvyou.action;

import com.lvyou.entity.Ranking;
import com.lvyou.entity.database.NewsEntity;
import com.lvyou.service.BlackList;
import com.lvyou.service.MapService;
import com.lvyou.service.OverallRanking;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;

/**
 * Created by win7 on 2017/3/15.
 */
public class Showlist {
    private List<Ranking> rankinglist;
    private List<BlackList> blacklist;

    public List<BlackList> getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(List<BlackList> blacklist) {
        this.blacklist = blacklist;
    }

    public List<Ranking> getRankinglist() {
        return rankinglist;
    }

    public void setRankinglist(List<Ranking> rankinglist) {
        this.rankinglist = rankinglist;
    }

    public String show(){
        OverallRanking a = new OverallRanking();
        rankinglist=a.overallRanking();
        blacklist = new BlackList().getBlackList();
        ActionContext.getContext().put("rankinglist",rankinglist);
        ActionContext.getContext().put("blacklist",blacklist);
        MapService mapService = new MapService();
        List<NewsEntity> newsEntities = mapService.findAllInfo();
        ActionContext.getContext().put("newsEntities",newsEntities);
        return "success";
    }
}
