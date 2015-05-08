package com.clinic.services;

import com.clinic.dao.Patientdao;
import com.clinic.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public class PatientServiceImpl implements PatientService{
    @Autowired
    Patientdao patientdao;

    @Override
    public int insertRow(Patient patient){
        return patientdao.insertRow(patient);
    }

    @Override
    public List<Patient> getList() {
        return patientdao.getList();
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
