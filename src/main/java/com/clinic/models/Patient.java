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
    private int patientId;

    private String firstName;

    private String lastName;

    private String dateOfBirth;


}
