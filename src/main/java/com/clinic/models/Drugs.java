package com.clinic.models;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by susan on 5/7/15.
 */
@Entity
@Table(name="drugs")
public class Drugs {
    @Id
    @GeneratedValue
    private int drugid;

    @Column(name = "patientId")
    private String patientId;

    @Column(name = "drugName")
    private String druname;

    @Column(name = "dateOfBirth")
    private String dob;


}
