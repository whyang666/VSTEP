package com.lvyou.dao;

/**
 * Created by WHY on 2017/3/11.
 */

import com.lvyou.entity.database.SearchEntity;

import java.util.List;

/**
 * 这个用于查询Search视图
 */
public interface SearchDao {
    /**
     * 对search视图中的内容进行搜索
     * @param input 用户想要查询的信息
     * @return 和输入信息相关的SearchEntiy
     */
    List<SearchEntity> searchall(String input);

    /**
     *
     * @param input
     * @return
     */
    List<SearchEntity> searchHead(String input);

    /**
     *
     * @param input
     * @return
     */
    List<SearchEntity> searchBranch(String input);

    /**
     *
     * @param input
     * @return
     */
    List<SearchEntity> searchType(String input);

    /**
     *
     * @param input
     * @return
     */
    List<SearchEntity> searchLegalPerson(String input);

}
