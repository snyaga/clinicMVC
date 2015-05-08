package com.clinic.models;

import javax.persistence.*;

/**
 * Created by susan on 5/7/15.
 */
@Entity
@Table(name="drugs")
public class Drugs {
    @Id
    @GeneratedValue
    private int drugId;


    private int patientId;


    private String drugName;


    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }



}
