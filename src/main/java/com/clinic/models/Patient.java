package com.clinic.models;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by susan on 5/7/15.
 */
@Entity
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue
    private int patientId;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
