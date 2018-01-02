package com.lvyou.dao;

import com.lvyou.entity.database.HeadCompanyEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

import static org.hibernate.FlushMode.AUTO;

/**
 * Created by Shen-FH on 2017/3/11.
 */
public class HeadCompanyDaoImp implements HeadCompanyDao {
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
    public HeadCompanyEntity get(Integer id) {
        List<HeadCompanyEntity> h = null;
        h = (List<HeadCompanyEntity>)getHibernateTemplate().find("from HeadCompanyEntity h where h.hCid=?",id);
        return h.get(0);
    }

    @Override
    public Integer save(HeadCompanyEntity headComany) {
        getHibernateTemplate().getSessionFactory().getCurrentSession().setHibernateFlushMode(AUTO);
        return (Integer)getHibernateTemplate().save(headComany);
    }

    @Override
    public List<HeadCompanyEntity> findByName(String name) {
        return (List<HeadCompanyEntity>)getHibernateTemplate().find("from HeadCompanyEntity h where h.hCname like ?","%"+name+"%");
    }
}
