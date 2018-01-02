package com.lvyou.service;

import com.lvyou.dao.BranchComanyDao;
import com.lvyou.dao.HeadCompanyDao;
import com.lvyou.dao.ScoreDao;
import com.lvyou.dao.SearchDao;
import com.lvyou.entity.SearchInfo;
import com.lvyou.entity.database.BranchComanyEntity;
import com.lvyou.entity.database.HeadCompanyEntity;
import com.lvyou.entity.database.ScoreEntity;
import com.lvyou.entity.database.SearchEntity;
import com.lvyou.util.ApplicationContextAwareImp;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Shen-FH on 2017/3/11.
 */
public class SearchServiceImp implements SearchService {
    private ApplicationContext context = ApplicationContextAwareImp.getApplicationContext();
    private SearchDao searchDao = (SearchDao)context.getBean("searchDao");
    private ScoreDao scoreDao = (ScoreDao)context.getBean("scoreDao");
    private BranchComanyDao branchComanyDao = (BranchComanyDao)context.getBean("branchComanyDao");
    private HeadCompanyDao headCompanyDao = (HeadCompanyDao)context.getBean("headCompanyDao");

    private SessionFactory sessionFactory = null;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<SearchInfo> searchHead(String name) {
        List<SearchInfo> searchInfos = new ArrayList<>();
        List<SearchEntity> searchEntities = searchDao.searchHead(name);
        int max = searchEntities.size();
        for(int i = 0; i < max; i++){
            for (int j = 0; j < i; j++){
                if (searchEntities.get(i).gethCname().equals(searchEntities.get(j).gethCname())){
                    searchEntities.remove(i);
                    i--;
                    max--;
                    break;
                }
            }
        }
        System.err.println("########执行查询总公司#########");
        ScoreEntity scoreEntity;
        List<HeadCompanyEntity> headCompanyEntities;
        for (int i = 0; i < searchEntities.size(); i++){
            SearchInfo searchInfo = new SearchInfo();
            searchInfo.setCname(searchEntities.get(i).gethCname());
            searchInfo.setLegalperson(searchEntities.get(i).getLegalperson());
//            scoreEntity = scoreDao.findByName(searchEntities.get(i).gethCname());
//            if (scoreEntity.getTolal().length() > 0) {
//                searchInfo.setScore(scoreEntity.getTolal());
//            }
//            else {
//                searchInfo.setScore("0");
//            }
            searchInfo.setScore("0");
            searchInfo.setDate("暂无信息");
//            headCompanyEntities = headCompanyDao.findByName(searchEntities.get(i).gethCname());
//            searchInfo.setAddress(headCompanyEntities.get(0).gethCadd());
            searchInfo.setAddress("wu");
            if (i == 0) {
                searchInfos.add(searchInfo);
            }
            for (int j = 0; j < searchInfos.size(); j++) {
                if (searchInfos.get(j).getCname().equals(searchInfo.getCname())) {
                    break;
                }
                if (j == i - 1){
                    searchInfos.add(searchInfo);
                }
            }
        }
//        Collections.sort(searchInfos);
        return searchInfos;
    }

    @Override
    public List<SearchInfo> searchBranch(String name) {
        List<SearchInfo> searchInfos = new ArrayList<>();
        List<SearchEntity> searchEntities = searchDao.searchBranch(name);
        System.err.println("########执行查询fen公司#########");
        ScoreEntity scoreEntity;
        List<BranchComanyEntity> branchComanyEntities;
        for (int i = 0; i < searchEntities.size(); i++){
            SearchInfo searchInfo = new SearchInfo();

            searchInfo.setCname(searchEntities.get(i).getbCname());

            searchInfo.setLegalperson(searchEntities.get(i).getLegalperson());

            searchInfo.setScore("无");

            branchComanyEntities = branchComanyDao.findByName(searchEntities.get(i).getbCname());
            searchInfo.setDate(branchComanyEntities.get(0).getDate());

            searchInfo.setAddress("北京市");

            if (i == 0) {
                searchInfos.add(searchInfo);
            }
            for (int j = 0; j < searchInfos.size(); j++) {
                if (searchInfos.get(j).getCname().equals(searchInfo.getCname()) &&
                        searchInfos.get(j).getLegalperson().equals(searchInfo.getLegalperson())) {
                    break;
                }
                if (j == i - 1){
                    searchInfos.add(searchInfo);
                }
            }
        }
        Collections.sort(searchInfos);
        return searchInfos;
    }

    @Override
    public List<SearchInfo> searchType(String type) {
        return doSearch(type, "Type");
    }

    @Override
    public List<SearchInfo> searchLegalPerson(String name) {
        return doSearch(name, "LegalPerson");
    }

    public List<SearchInfo> doSearch (String data, String type) {
        List<SearchInfo> searchInfos1 = new ArrayList<>();
        List<SearchInfo> searchInfos2 = new ArrayList<>();
        List<SearchEntity> searchEntities;
        if (type.equals("Type")) {
            searchEntities = searchDao.searchType(data);
        }
        else {
            searchEntities = searchDao.searchLegalPerson(data);
        }
        ScoreEntity scoreEntity;
        List<HeadCompanyEntity> headCompanyEntities;
        List<BranchComanyEntity> branchComanyEntities;
        for (int i = 0; i < searchEntities.size(); i++){
            SearchInfo searchInfo = new SearchInfo();

            searchInfo.setCname(searchEntities.get(i).gethCname());

            searchInfo.setLegalperson(searchEntities.get(i).getLegalperson());

            scoreEntity = scoreDao.findByName(searchEntities.get(i).gethCname());
            if (scoreEntity.getTolal().length() > 0) {
                searchInfo.setScore(scoreEntity.getTolal());
            }
            else {
                searchInfo.setScore("0");
            }

            searchInfo.setDate("暂无信息");

            headCompanyEntities = headCompanyDao.findByName(searchEntities.get(i).gethCname());
            searchInfo.setAddress(headCompanyEntities.get(0).gethCadd());

            if (i == 0) {
                searchInfos1.add(searchInfo);
            }
            for (int j = 0; j < searchInfos1.size(); j++) {
                if (searchInfos1.get(j).getCname().equals(searchInfo.getCname()) &&
                        searchInfos1.get(j).getLegalperson().equals(searchInfo.getLegalperson())) {
                    break;
                }
                if (j == i - 1){
                    searchInfos1.add(searchInfo);
                }
            }
        }
        Collections.sort(searchInfos1);
        for (int i = 0; i < searchEntities.size(); i++){
            SearchInfo searchInfo = new SearchInfo();

            searchInfo.setCname(searchEntities.get(i).getbCname());

            searchInfo.setLegalperson(searchEntities.get(i).getLegalperson());

            searchInfo.setScore("无");

            branchComanyEntities = branchComanyDao.findByName(searchEntities.get(i).getbCname());
            searchInfo.setDate(branchComanyEntities.get(0).getDate());

            searchInfo.setAddress("北京市");

            if (i == 0) {
                searchInfos2.add(searchInfo);
            }
            for (int j = 0; j < searchInfos2.size(); j++) {
                if (searchInfos2.get(j).getCname().equals(searchInfo.getCname()) &&
                        searchInfos2.get(j).getLegalperson().equals(searchInfo.getLegalperson())) {
                    break;
                }
                if (j == i - 1){
                    searchInfos2.add(searchInfo);
                }
            }
        }
        Collections.sort(searchInfos2);
        searchInfos1.addAll(searchInfos2);
        return searchInfos1;
    }
}
