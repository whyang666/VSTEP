package com.lvyou.dao;

import com.lvyou.entity.database.ScoreEntity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/11.
 */
public interface ScoreDao {
    ScoreEntity findByName(String name);

    List<ScoreEntity> findAll();
}
