package com.lvyou.dao;

import com.lvyou.entity.database.BranchComanyEntity;

import java.util.List;

/**
 * Created by WHY on 2017/3/11.
 */
public interface BranchComanyDao {
    /**
     * 加载分公司表BranchComany中的实例
     * @param id 指定需要返回的实例的主键
     * @return 加载BranchComanyEntity的实例
     */
     BranchComanyEntity get(Integer id);

    /**
     * 保存branchComany实例
     * @param branchComany 指定需要保存的BranchComany实例
     * @return 保存后的标识属性值：0为成功
     */
     Integer save(BranchComanyEntity branchComany);

    /**
     * 根据分公司名查找公司
     * @param name 指定要查找的BranchComany的名字
     * @return 分公司名对应的全部分公司
     */
     List<BranchComanyEntity> findByName(String name);

    /**
     * 根据总公司名查找该公司下所有的分公司
     * @param headCompany 指定要查找的总公司名
     * @return 总公司名对应的全部分公司
     */
     List<BranchComanyEntity> findByHeadComany(String headCompany);

    /**
     * 根据分公司法人查找该法人名下的所有分公司
     * @param name 指定要查找的法人的名字
     * @return 该法人对应的所有分公司
     */
     List<BranchComanyEntity> findByLegalPersion(String name);

    /**
     * 通过总公司名字找注销的分支机构
     * @return
     */
    List<BranchComanyEntity> findCancellation(String name);

    /**
     * 通过总公司名字找吊销的分支机构
     * @return
     */
    List<BranchComanyEntity> findRevoke(String name);
}
