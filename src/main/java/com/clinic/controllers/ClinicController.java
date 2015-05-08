package com.clinic.controllers;

import com.clinic.models.Drug;
import com.clinic.models.Patient;
import com.clinic.services.DrugService;
import com.clinic.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
@Controller
public class ClinicController {
    @Autowired
    PatientService patientService;

    @Autowired
    DrugService drugService;

    @RequestMapping("/patient")
    public ModelAndView patient(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg","Register a patient");
        model.setViewName("registration");

        return model;
    }

    @RequestMapping("/register")
    public ModelAndView register(@RequestParam(value = "firstName", required = false) String firstName,
                                 @RequestParam(value = "lastName", required = false) String lastName,
                                 @RequestParam(value = "dateOfBirth", required = false) String dateOfBirth) {
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Patient has been successfully added");
        Patient patient = new Patient();
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setDateOfBirth(dateOfBirth);
        patientService.insertRow(patient);
        model.setViewName("registration");

        return model;
    }

    @RequestMapping("/drug")
    public ModelAndView drug(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Add a drug");
        model.setViewName("drug");

        return model;
    }

    @RequestMapping("/record")
    public ModelAndView record(@RequestParam(value = "patientId", required = false) int patientId,
    @RequestParam(value = "drugName", required = false) String drugName)
    {
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Drug added");
        Drug drug = new Drug();
        drug.setPatientId(patientId);
        drug.setDrugName(drugName);
        drugService.insertRow(drug);
        model.setViewName("drug");
        return model;
    }

@RequestMapping("/display")
/*public void list() {

    List<Drug> drugList = drugService.getList();

    for (Drug drug : drugList) {
        System.out.println(drug.getDrugId() + " " + drug.getDrugName() + " " + drug.getPatientId());
        System.out.println("\n\n**********************************\n\n");
    }
}*/

    public void list() {

        List<Patient> patientList = patientService.getList();

        for (Patient patient : patientList) {
            System.out.println(patient.getPatientId() + " " + patient.getFirstName() + " " + patient.getLastName() + " "
            + patient.getDateOfBirth());
            System.out.println("\n\n**********************************\n\n");
        }
    }


}
