package com.clinic.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by susan on 5/7/15.
 */
public class Patient {
    @Id
    @GeneratedValue
    private int patientid;

    @Column(name = "firstName")
    private String fname;

    @Column(name = "lastName")
    private String lname;

    @Column(name = "dateOfBirth")
    private String dob;


}
