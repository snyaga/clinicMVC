package com.clinic.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by susan on 5/7/15.
 */
public class Drugs {
    @Id
    @GeneratedValue
    private int drugid;

    @Column(name = "patientID")
    private String pid;

    @Column(name = "drugName")
    private String dname;

    @Column(name = "dateOfBirth")
    private String dob;
}
