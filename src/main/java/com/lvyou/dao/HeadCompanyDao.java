package com.lvyou.dao;

import com.lvyou.entity.database.HeadCompanyEntity;

import java.util.List;

/**
 * Created by WHY on 2017/3/11.
 */
public interface HeadCompanyDao {
    /**
     * 加载分公司表HeadCompany中的实例
     * @param id 指定需要返回的实例的主键
     * @return 加载HeadCompanyEntity的实例
     */
    HeadCompanyEntity get(Integer id);

    /**
     * 保存branchComany实例
     * @param headComany 指定需要保存的HeadCompany实例
     * @return 保存后的标识属性值：0为成功
     */
    Integer save(HeadCompanyEntity headComany);

    /**
     * 根据总公司名查找公司
     * @param name 指定要查找的HeadCompany的名字
     * @return 总公司名对应的全部总公司
     */
    List<HeadCompanyEntity> findByName(String name);

//    没有这个东西。。。。
//    /**
//     * 根据总公司法人查找该法人名下的所有总公司
//     * @param name 指定要查找的法人的名字
//     * @return 该法人对应的所有总公司
//     */
//    List<HeadCompanyEntity> findByLegalPersion(String name);
//

}
