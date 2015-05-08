package com.clinic.dao.impl;

import com.clinic.models.Patient;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public class PatientDaoImpl {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int insertRow(Patient patient) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(patient);
        tx.commit();
        Serializable id = session.getIdentifier(patient);
        session.close();
        return (Integer) id;
    }


    @Override
    public List<Patient> getList() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Patient> employeeList = session.createQuery("from Patient").list();
        session.close();
        return patientList;
    }

    @Override
    public int updateRow(Patient patient) {
        return 0;
    }

    @Override
    public int deleteRow(int patientId) {
        return 0;
    }
}
