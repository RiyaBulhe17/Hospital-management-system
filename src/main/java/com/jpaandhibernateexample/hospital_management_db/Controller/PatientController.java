package com.jpaandhibernateexample.hospital_management_db.Controller;
import com.jpaandhibernateexample.hospital_management_db.model.Doctor;
import com.jpaandhibernateexample.hospital_management_db.model.Patient;
import com.jpaandhibernateexample.hospital_management_db.service.Doctorservice;
import com.jpaandhibernateexample.hospital_management_db.service.Patientservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patient/apis")
public class PatientController {
    @Autowired
    Patientservice patientService;

    @PostMapping("/save")
    public String savePatient(@RequestBody Patient patient) {
        String response = patientService.addPatient(patient);
        return response;
    }
}
