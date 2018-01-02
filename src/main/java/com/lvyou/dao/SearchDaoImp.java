package com.lvyou.dao;

import com.lvyou.entity.database.SearchEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by Shen-FH on 2017/3/11.
 */
public class SearchDaoImp implements SearchDao {
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
    public List<SearchEntity> searchall(String input) {
        return null;
    }

    @Override
    public List<SearchEntity> searchHead(String input) {
        return (List<SearchEntity>)getHibernateTemplate().find("from SearchEntity s where s.hCname like ?","%"+input+"%");
    }

    @Override
    public List<SearchEntity> searchBranch(String input) {
        return (List<SearchEntity>)getHibernateTemplate().find("from SearchEntity s where s.bCname like ?","%"+input+"%");
    }

    @Override
    public List<SearchEntity> searchType(String input) {
        return (List<SearchEntity>)getHibernateTemplate().find("from SearchEntity s where s.business like ?","%"+input+"%");
    }

    @Override
    public List<SearchEntity> searchLegalPerson(String input) {
        return (List<SearchEntity>)getHibernateTemplate().find("from SearchEntity s where s.legalperson like ?","%"+input+"%");
    }
}
