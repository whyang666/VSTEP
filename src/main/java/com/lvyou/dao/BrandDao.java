package com.lvyou.dao;

import com.lvyou.entity.database.BrandEntity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/17.
 */
public interface BrandDao {
    /**
     * 通过公司名字找商标信息
     * @param name
     * @return
     */
    List<BrandEntity> findByName(String name);
}
