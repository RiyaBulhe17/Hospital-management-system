package com.jpaandhibernateexample.hospital_management_db.service;
import com.jpaandhibernateexample.hospital_management_db.model.Doctor;
import com.jpaandhibernateexample.hospital_management_db.model.Patient;
import com.jpaandhibernateexample.hospital_management_db.model.Ward;
import com.jpaandhibernateexample.hospital_management_db.repository.Doctorrepository;
import com.jpaandhibernateexample.hospital_management_db.repository.Patientrepository;
import com.jpaandhibernateexample.hospital_management_db.repository.Wardrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Wardservice {
    @Autowired
    Wardrepository wardrepository;

    public String addWard(Ward ward){
        wardrepository.save(ward);
        return "Patient saved successfully";
    }
}
