package com.lvyou.dao;

import com.lvyou.entity.database.BranchComanyEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hibernate.FlushMode.AUTO;

/**
 * Created by WHY on 2017/3/11.
 */
public class BranchComanyDaoImp implements BranchComanyDao {
    private HibernateTemplate hibernateTemplate = null;
    private SessionFactory sessionFactory = null;

    public HibernateTemplate getHibernateTemplate() {
        if(hibernateTemplate == null)
            hibernateTemplate = new HibernateTemplate(sessionFactory);
        return hibernateTemplate;
    }
    //用于依赖注入的
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public BranchComanyEntity get(Integer id) {
        return (BranchComanyEntity)getHibernateTemplate().get(BranchComanyEntity.class,id);
    }

    @Transactional
    @Override
    public Integer save(BranchComanyEntity branchComany) {
        getHibernateTemplate().getSessionFactory().getCurrentSession().setHibernateFlushMode(AUTO);
        return (Integer)getHibernateTemplate().save(branchComany);
    }

    @Override
    public List<BranchComanyEntity> findByName(String name) {
        return (List<BranchComanyEntity>)getHibernateTemplate().find("from BranchComanyEntity as b where b.bCname like ?","%"+name+"%");
    }

    @Override
    public List<BranchComanyEntity> findByHeadComany(String headCompany) {
        return (List<BranchComanyEntity>)getHibernateTemplate().find("from BranchComanyEntity as b where b.hCname like ?","%"+headCompany+"%");
    }

    @Override
    public List<BranchComanyEntity> findByLegalPersion(String name) {
        return (List<BranchComanyEntity>)getHibernateTemplate().find("from BranchComanyEntity as b where b.legalperson like ?","%"+name+"%");
    }

    @Override
    public List<BranchComanyEntity> findCancellation(String name) {
        return (List<BranchComanyEntity>)getHibernateTemplate().find("from BranchComanyEntity as b where b.hCname = ? and b.state = '3'",name);
    }

    @Override
    public List<BranchComanyEntity> findRevoke(String name) {
        return (List<BranchComanyEntity>)getHibernateTemplate().find("from BranchComanyEntity as b where b.hCname = ? and b.state = '2'",name);
    }
}
