package com.clinic.services;

import com.clinic.models.Patient;

import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public interface PatientService {
    public int insertRow(Patient patient);

    public List<Patient> getList();

    public int updateRow(Patient patient);

    public int deleteRow(int patientId);
}
