package com.lvyou.dao;

import com.lvyou.entity.database.PatentEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/17.
 */
public class PatentDaoImp implements PatentDao{
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
    public List<PatentEntity> findByName(String name) {
        return (List<PatentEntity>)getHibernateTemplate().find("from PatentEntity p where p.hCname = ?",name);
    }
}
