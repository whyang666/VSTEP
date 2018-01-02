package com.lvyou.dao;

import com.lvyou.entity.database.User1Entity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hibernate.FlushMode.AUTO;


/**
 * Created by WHY on 2017/2/24.
 */
public class UserDaoImp implements UserDao {
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
    public User1Entity get(Integer id) {
        return getHibernateTemplate().get(User1Entity.class,id);
    }

    @Transactional
    @Override
    public Integer save(User1Entity user) {
        getHibernateTemplate().getSessionFactory().getCurrentSession().setHibernateFlushMode(AUTO);
        return (Integer)getHibernateTemplate().save(user);
    }

    @Override
    public List<User1Entity> findByName(String name) {
        return (List<User1Entity>)getHibernateTemplate().find("from User1Entity u where u.uname=?",name);
    }
}
