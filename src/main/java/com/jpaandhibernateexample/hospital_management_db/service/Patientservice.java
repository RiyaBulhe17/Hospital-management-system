package com.jpaandhibernateexample.hospital_management_db.service;
import com.jpaandhibernateexample.hospital_management_db.model.Doctor;
import com.jpaandhibernateexample.hospital_management_db.model.Patient;
import com.jpaandhibernateexample.hospital_management_db.repository.Doctorrepository;
import com.jpaandhibernateexample.hospital_management_db.repository.Patientrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Patientservice {
    @Autowired
    Patientrepository patientrepository;

    public String addPatient(Patient patient){
        patientrepository.save(patient);
        return "Patient saved successfully";
    }
}
