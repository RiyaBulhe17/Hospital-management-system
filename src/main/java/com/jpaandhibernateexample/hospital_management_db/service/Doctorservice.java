package com.jpaandhibernateexample.hospital_management_db.service;
import com.jpaandhibernateexample.hospital_management_db.model.Doctor;
import com.jpaandhibernateexample.hospital_management_db.repository.Doctorrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service//optional- contains the bussiness logic
public class Doctorservice {

    @Autowired
    Doctorrepository doctorrepository;

    public String addDoctor(Doctor doctor){
            doctorrepository.save(doctor);
            return "Doctor saved successfully";
    }
    public Doctor getDoctorbyId(int id){
        Optional<Doctor> doctorOptional = doctorrepository.findById(id);
        if(doctorOptional.isPresent()){
            return doctorOptional.get();
        }else {
            return null;
        }
    }
    public List<Doctor> getAllDoctors(){
        List<Doctor> doctorList = doctorrepository.findAll();
        return doctorList;
    }

    public String countDoctors(){
        long totalCount = doctorrepository.count();
        return "total num of doctors are :"+totalCount;
    }
    public String deleteDoctorById(int id){
        Doctor existingDoctor = getDoctorbyId(id);
        if(existingDoctor!=null){
            return "Doctor with id :"+id+"is  deleted ";
        }else {
            return "Doctor with id :"+id+"is not present to delete ";
        }
    }
}
