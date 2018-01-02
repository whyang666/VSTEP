package com.lvyou.entity;

/**
 * Created by Shen-FH on 2017/3/15.
 */
public class CompanyInfo {
    private String companyName;
    private String legalperson;
    private String enterprise_type;
    private String date;
    private String addnum;
    private String category;
    private String state;
    private String address;
    private String total;
    private SecondScore secondScore;
    private ThirdScore thirdScore;

    public CompanyInfo() {
        secondScore = new SecondScore();
        thirdScore = new ThirdScore();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public String getEnterprise_type() {
        return enterprise_type;
    }

    public void setEnterprise_type(String enterprise_type) {
        this.enterprise_type = enterprise_type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddnum() {
        return addnum;
    }

    public void setAddnum(String addnum) {
        this.addnum = addnum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getState() {
        if (state.equals("1"))
            state="正在运营";
        else if (state.equals("2"))
            state="已吊销";
        else
            state="已注销";
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public SecondScore getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(SecondScore secondScore) {
        this.secondScore = secondScore;
    }

    public ThirdScore getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(ThirdScore thirdScore) {
        this.thirdScore = thirdScore;
    }
}
