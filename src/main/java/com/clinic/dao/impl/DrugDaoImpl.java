package com.clinic.dao.impl;

import com.clinic.dao.Drugsdao;
import com.clinic.models.Drugs;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public class DrugDaoImpl implements Drugsdao {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int insertRow(Drugs drugs) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(drugs);
        tx.commit();
        Serializable id = session.getIdentifier(drugs);
        session.close();
        return (Integer) id;
    }


    @Override
    public List<Drugs> getList() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Drugs> drugsList = session.createQuery("from Drugs").list();
        session.close();
        return drugsList;
    }

    @Override
    public int updateRow(Drugs drugs) {
        return 0;
    }

    @Override
    public int deleteRow(int drugsId) {
        return 0;
    }

}
