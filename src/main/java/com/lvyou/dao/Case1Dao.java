package com.lvyou.dao;

import com.lvyou.entity.database.Case1Entity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/17.
 */
public interface Case1Dao {
    /**
     * 通过公司名找涉案信息
     * @param name
     * @return
     */
    List<Case1Entity> findByName(String name);
}
