package com.lvyou.action;

import com.lvyou.entity.CompanyInfo;
import com.lvyou.entity.Ranking;
import com.lvyou.entity.SearchInfo;
import com.lvyou.service.InformationService;
import com.lvyou.service.OverallRanking;
import com.lvyou.service.SearchService;
import com.lvyou.service.SearchServiceImp;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;

/**
 * Created by win7 on 2017/3/15.
 */
public class DetailAction {
    private String companyname;
    private List<SearchInfo> result;
    private CompanyInfo companyInfo;
    private float total;
    private List<Ranking> rankinglist;

    public List<Ranking> getRankinglist() {
        return rankinglist;
    }

    public void setRankinglist(List<Ranking> rankinglist) {
        this.rankinglist = rankinglist;
    }

    public CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public List<SearchInfo> getResult() {
        return result;
    }

    public void setResult(List<SearchInfo> result) {
        this.result = result;
    }

    public String detail(){
        SearchService s = new SearchServiceImp();
        result = s.searchHead(companyname);
        companyInfo=new InformationService().findDetail(companyname);
        String ss= companyInfo.getTotal();
        if (ss!=null)
            total=Float.parseFloat(ss);
        else
            total = 0f;
        OverallRanking a = new OverallRanking();
        rankinglist=a.overallRanking();
        ActionContext.getContext().put("total",total);
        ActionContext.getContext().put("companyInfo",companyInfo);
        ActionContext.getContext().put("third",companyInfo.getThirdScore());
        ActionContext.getContext().put("companyname",companyname);
        ActionContext.getContext().put("rankinglist",rankinglist);
        return "success";
    }
}
