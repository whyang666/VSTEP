package com.lvyou.action;


import com.lvyou.entity.Ranking;
import com.lvyou.entity.SearchInfo;
import com.lvyou.service.OverallRanking;
import com.lvyou.service.SearchService;
import com.lvyou.service.SearchServiceImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

//import javax.servlet.http.HttpServletRequest;

/**
 * Created by win7 on 2017/3/11.
 */
public class SearchAction extends ActionSupport{
    private String companyname;
    private List<SearchInfo> result;
    private List<Ranking> rankinglist;

    public List<Ranking> getRankinglist() {
        return rankinglist;
    }

    public void setRankinglist(List<Ranking> rankinglist) {
        this.rankinglist = rankinglist;
    }

    public List<SearchInfo> getResult() {
        return result;
    }

    public void setResult(List<SearchInfo> result) {
        this.result = result;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String search(){
        SearchService s = new SearchServiceImp();
        result = s.searchHead(companyname);
        ActionContext.getContext().put("list",result);
        OverallRanking a = new OverallRanking();
        rankinglist=a.overallRanking();
        ActionContext.getContext().put("rankinglist",rankinglist);
        if (result.size()==0)
            return "error";
        return "success";
    }



}
