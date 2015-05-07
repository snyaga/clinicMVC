package com.clinic.controllers;

import com.clinic.models.Drugs;
import com.clinic.models.Patient;
import com.clinic.services.DrugService;
import com.clinic.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by susan on 5/7/15.
 */
public class Clinic {
    @Autowired
    PatientService patientService;
    
    @Autowired
    DrugService drugService;

    @RequestMapping("/register")
    public ModelAndView register(@RequestParam(value = "fname", required = false) String fname),
                        @RequestParam(value = "lname", required = false) String lname,
                        @RequestParam(value = "dob", required = false) String dob)
    {
        ModelAndView model = new ModelAndView();
        Patient patient = new Patient();
        patient.setFname(fname);
        patient.setLname(lname);
        patient.setDob(dob);
        patiientService.insertRow(patient);


    }

    @RequestMapping("/drugs")
    public ModelAndView register(@RequestParam(value = "pid", required = false) String pid),
    @RequestParam(value = "dname", required = false) String dname)
    {
        ModelAndView model = new ModelAndView();
        Drugs drugs = new Drugs();
        drugs.setPid(pid);
        drugs.setDname(dname);
        drugService.insertRow(drug);


    }




}
