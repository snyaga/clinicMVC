package com.clinic.services;

import com.clinic.dao.Patientdao;
import com.clinic.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;

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
}
