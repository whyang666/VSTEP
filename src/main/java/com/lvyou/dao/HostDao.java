package com.lvyou.dao;

import com.lvyou.entity.database.HostEntity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/21.
 */
public interface HostDao {
    List<HostEntity> findByName(String name);
}
