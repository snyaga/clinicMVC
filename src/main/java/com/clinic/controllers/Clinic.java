package com.clinic.controllers;

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




}
