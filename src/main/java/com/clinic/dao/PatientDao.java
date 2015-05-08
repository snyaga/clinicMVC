package com.clinic.dao;

import com.clinic.models.Patient;

import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public interface PatientDao {
    public int insertRow(Patient patient );

    public List<Patient> getList();

    public int updateRow(Patient patient);

    public int deleteRow(int patientId);
}
