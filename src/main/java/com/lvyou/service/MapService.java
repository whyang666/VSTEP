package com.lvyou.service;

import com.lvyou.dao.NewsDao;
import com.lvyou.entity.database.NewsEntity;
import com.lvyou.util.ApplicationContextAwareImp;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * Created by Shen-FH on 2017/4/8.
 */
public class MapService {
    ApplicationContext context = ApplicationContextAwareImp.getApplicationContext();

    NewsDao newsDao = (NewsDao)context.getBean("newsDao");

    public List<NewsEntity> findAllInfo() {
        List<NewsEntity> newsEntities = newsDao.findAll();
        return newsEntities;
    }
}
