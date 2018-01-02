package com.lvyou.dao;

import com.lvyou.entity.database.RecruitmentEntity;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/21.
 */
public interface RecruitmentDao {
    List<RecruitmentEntity> findByName(String name);
}
