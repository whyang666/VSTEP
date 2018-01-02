package com.lvyou.dao;

import com.lvyou.entity.database.ScoreEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/11.
 */
public class ScoreDaoImp implements ScoreDao {
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
    public ScoreEntity findByName(String name) {
        List<ScoreEntity> s= null;
        s = (List<ScoreEntity>)getHibernateTemplate().find("from ScoreEntity s where s.hCname=?",name);
        return s.get(0);
    }

    @Override
    public List<ScoreEntity> findAll() {
        List<ScoreEntity> s = null;
        s = (List<ScoreEntity>)getHibernateTemplate().find("from ScoreEntity");
        return s;
    }
}
