package com.lvyou.dao;

import com.lvyou.entity.database.PatentEntity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/17.
 */
public interface PatentDao {
    /**
     * 通过公司名字找专利信息
     * @param name
     * @return
     */
    List<PatentEntity> findByName(String name);
}
