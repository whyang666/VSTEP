package com.lvyou.dao;

import com.lvyou.entity.database.NewsEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by Shen-FH on 2017/4/8.
 */
public class NewsDaoImp implements NewsDao{
    private HibernateTemplate hibernateTemplate = null;
    private SessionFactory sessionFactory = null;

    public HibernateTemplate getHibernateTemplate() {
        if(hibernateTemplate == null)
            hibernateTemplate = new HibernateTemplate(sessionFactory);
        return hibernateTemplate;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<NewsEntity> findAll() {
        return (List<NewsEntity>)getHibernateTemplate().find("from NewsEntity");
    }
}
