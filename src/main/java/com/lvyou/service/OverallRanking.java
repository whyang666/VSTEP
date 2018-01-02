package com.lvyou.service;

import com.lvyou.dao.ScoreDao;
import com.lvyou.entity.Ranking;
import com.lvyou.entity.database.ScoreEntity;
import com.lvyou.util.ApplicationContextAwareImp;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Susan on 2017/3/11.
 */

public class OverallRanking {
    ApplicationContext context = ApplicationContextAwareImp.getApplicationContext();
    ScoreDao scoreDao = (ScoreDao)context.getBean("scoreDao");

    public List<Ranking> overallRanking(){
        List<ScoreEntity> list = scoreDao.findAll();
        System.err.println("##############调用overallRanking");
        //将公司按总分降序排列
        //按照分数降序排列
        Collections.sort(list, (arg0, arg1) -> {
            double score0 = Double.valueOf(arg0.getTolal());
            double score1 = Double.valueOf(arg1.getTolal());
            if (score1 > score0) {
                return 1;
            } else if (score1-score0 < 0.00000001 && score1-score0 > -0.0000001) {
                return 0;
            } else {
                return -1;
            }
        });
        ScoreEntity entity;
        Ranking temp;
        List<Ranking> result = new ArrayList<>();
        for(int i = 0;i < 15;i++){
            entity = list.get(i);
            temp = new Ranking(entity.gethCname(),Double.valueOf(entity.getTolal()));
            result.add(temp);
        }
        return result;
    }
}
