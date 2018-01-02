package com.lvyou.dao;

import com.lvyou.entity.database.SoftwareEntity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/17.
 */
public interface SoftwareDao {
    /**
     * 通过公司名字找软件作品
     * @return
     */
    List<SoftwareEntity> findByName(String name);
}
