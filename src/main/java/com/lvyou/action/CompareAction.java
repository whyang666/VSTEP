package com.lvyou.action;

import com.lvyou.entity.CompanyInfo;
import com.lvyou.entity.SearchInfo;
import com.lvyou.service.InformationService;
import com.lvyou.service.SearchService;
import com.lvyou.service.SearchServiceImp;

import java.util.List;

/**
 * Created by win7 on 2017/4/8.
 */
public class CompareAction {
    private String companyname1;
    private String companyname2;
    private List<SearchInfo> result1;
    private CompanyInfo companyInfo1;
    private float total1;
    private List<SearchInfo> result2;
    private CompanyInfo companyInfo2;
    private float total2;

    public List<SearchInfo> getResult1() {
        return result1;
    }

    public void setResult1(List<SearchInfo> result1) {
        this.result1 = result1;
    }

    public CompanyInfo getCompanyInfo1() {
        return companyInfo1;
    }

    public void setCompanyInfo1(CompanyInfo companyInfo1) {
        this.companyInfo1 = companyInfo1;
    }

    public float getTotal1() {
        return total1;
    }

    public void setTotal1(float total1) {
        this.total1 = total1;
    }

    public List<SearchInfo> getResult2() {
        return result2;
    }

    public void setResult2(List<SearchInfo> result2) {
        this.result2 = result2;
    }

    public CompanyInfo getCompanyInfo2() {
        return companyInfo2;
    }

    public void setCompanyInfo2(CompanyInfo companyInfo2) {
        this.companyInfo2 = companyInfo2;
    }

    public float getTotal2() {
        return total2;
    }

    public void setTotal2(float total2) {
        this.total2 = total2;
    }

    public String getCompanyname1() {
        return companyname1;
    }

    public void setCompanyname1(String companyname1) {
        this.companyname1 = companyname1;
    }

    public String getCompanyname2() {
        return companyname2;
    }

    public void setCompanyname2(String companyname2) {
        this.companyname2 = companyname2;
    }

    public String compare(){
        SearchService s = new SearchServiceImp();
        result1 = s.searchHead(companyname1);
        companyInfo1=new InformationService().findDetail(companyname1);
//        companyInfo1.get
        String ss= companyInfo1.getTotal();
        if (ss!=null)
            total1=Float.parseFloat(ss);
        else
            total1 = 0f;
        result2 = s.searchHead(companyname2);
        companyInfo2=new InformationService().findDetail(companyname2);
        ss= companyInfo2.getTotal();
        if (ss!=null)
            total2=Float.parseFloat(ss);
        else
            total2 = 0f;
        total2=Float.parseFloat(companyInfo2.getTotal());
        return "success";
    }
}
