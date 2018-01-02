package com.lvyou.dao;

import com.lvyou.entity.database.NewsEntity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/4/8.
 */
public interface NewsDao {
    List<NewsEntity> findAll();
}
