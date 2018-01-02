package com.lvyou.dao;

import com.lvyou.entity.database.Rights12315Entity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/21.
 */
public class Right12315DaoImp implements Right12315Dao{

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
    public List<Rights12315Entity> findByName(String name) {
        return (List<Rights12315Entity>)getHibernateTemplate().find("from Rights12315Entity r where r.entityName = ?",name);
    }
}
