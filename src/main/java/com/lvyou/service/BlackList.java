package com.lvyou.service;

import com.lvyou.dao.CaseDao;
import com.lvyou.entity.database.Case1Entity;
import com.lvyou.util.ApplicationContextAwareImp;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BlackList {
    private String name = null;
    private String date = null;
    private String detail = null;

    public BlackList() {

    }

    public BlackList(String name, String date, String detail) {
        this.name = name;
        this.date = date;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获得处罚记录中最新的15条记录
     * @return 黑名单的List
     */
    public List<BlackList> getBlackList(){
        List<BlackList> blackLists = new ArrayList<>();
        ApplicationContext context = ApplicationContextAwareImp.getApplicationContext();
        CaseDao caseDao= (CaseDao)context.getBean("caseDao");
        List<Case1Entity> list = caseDao.getCase();
        list.sort(Comparator.comparing(Case1Entity::getDate));
        for(int i = 1;i<8;i++){
            Case1Entity case1Entity = list.get(list.size()-i);
            blackLists.add(new BlackList(case1Entity.gethCname(),case1Entity.getDate(),case1Entity.getCause()));
        }
        return blackLists;
    }
}
