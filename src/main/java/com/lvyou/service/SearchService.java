package com.lvyou.service;

import com.lvyou.entity.SearchInfo;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/11.
 */
public interface SearchService {
    /**
     *
     * @param name
     * @return
     */
    List<SearchInfo> searchHead(String name);

    /**
     *
     * @param name
     * @return
     */
    List<SearchInfo> searchBranch(String name);

    /**
     *
     * @param type
     * @return
     */
    List<SearchInfo> searchType(String type);

    /**
     *
     * @param name
     * @return
     */
    List<SearchInfo> searchLegalPerson(String name);
}
