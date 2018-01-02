package com.lvyou.entity;

/**
 * Created by Shen-FH on 2017/3/11.
 */
public class SearchInfo implements Comparable<SearchInfo>{
    private String cname;
    private String legalperson;
    private String score;
    private String date;
    private String address;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(SearchInfo arg1) {
        return arg1.getScore().compareTo(this.getScore());
    }
}
