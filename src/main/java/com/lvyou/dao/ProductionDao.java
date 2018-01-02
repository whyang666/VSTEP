package com.lvyou.dao;

import com.lvyou.entity.database.ProductionEntity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/17.
 */
public interface ProductionDao {
    /**
     *
     * @param name
     * @return
     */
    List<ProductionEntity> findByName(String name);
}
