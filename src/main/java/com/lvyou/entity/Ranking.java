package com.lvyou.entity;

/**
 * Created by Susan on 2017/3/12.
 */
public class Ranking {
    private String companyName;
    private double companyScore;

    public Ranking(String name, double score){
        companyName = name;
        companyScore = score;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCompanyScore() {
        return companyScore;
    }

    public void setCompanyScore(double companyScore) {
        this.companyScore = companyScore;
    }
}
