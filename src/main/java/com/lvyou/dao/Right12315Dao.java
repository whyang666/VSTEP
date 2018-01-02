package com.lvyou.dao;

import com.lvyou.entity.database.Rights12315Entity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/21.
 */
public interface Right12315Dao {
    List<Rights12315Entity> findByName(String name);
}
