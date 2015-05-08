package com.clinic.controllers;

import com.clinic.models.Drugs;
import com.clinic.models.Patient;
import com.clinic.services.DrugService;
import com.clinic.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
@Controller
public class Clinic {
    @Autowired
    PatientService patientService;

    @Autowired
    DrugService drugService;

    @RequestMapping("/index")
    public ModelAndView hello1(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg","WELCOME TO SPRING MVC");
        model.setViewName("registration");

        return model;
    }

    @RequestMapping("/register")
    public ModelAndView register(@RequestParam(value = "firstName", required = false) String fname,
                                 @RequestParam(value = "lastName", required = false) String lname,
                                 @RequestParam(value = "dateOfBirth", required = false) Date dob) {
        ModelAndView model = new ModelAndView();
        Patient patient = new Patient();
        patient.setFirstName(fname);
        patient.setLastName(lname);
        patient.setDateOfBirth(dob);
        patientService.insertRow(patient);

        return model;
    }



    @RequestMapping("/drugs")
    public ModelAndView register(@RequestParam(value = "patientId", required = false) int patientId,
    @RequestParam(value = "dname", required = false) String dname)
    {
        ModelAndView model = new ModelAndView();
        Drugs drugs = new Drugs();
        drugs.setPatientId(patientId);
        drugs.setDrugName(dname);
        drugService.insertRow(drugs);
        return model;
    }

@RequestMapping("/display")
public void list() {

    List<Drugs> drugList = drugService.getList();

    for (Drugs drugs : drugList) {
        System.out.println(drugs.getDrugId() + " " + drugs.getDrugName() + " " + drugs.getPatientId());
        System.out.println("\n\n**********************************\n\n");
    }
}



}
