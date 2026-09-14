package com.jpaandhibernateexample.hospital_management_db.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.jpaandhibernateexample.hospital_management_db.model.Doctor;
import com.jpaandhibernateexample.hospital_management_db.service.Doctorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor/apis")
public class DoctorController {

    //request ->API (Controller)-> service -> repository ->service(response) ->API response -> user/frontend/postman(response)
    @Autowired
    Doctorservice doctorService;

    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor doctor){
        String response = doctorService.addDoctor(doctor);
        return response;
    }
    @GetMapping("/findById/{id}")
    public Doctor findDoctorById(@PathVariable int id){
        Doctor doctor = doctorService.getDoctorbyId(id);
        return doctor;
    }
    @GetMapping("/findAll")
    public List<Doctor> findAllDoctor(){
        List<Doctor> doctorList = doctorService.getAllDoctors();
        return doctorList;

    }
    @GetMapping("/count")
    public String countDoctors(){
        String response = doctorService.countDoctors();
        return response;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteDoctorById(@PathVariable int id){
        String response = doctorService.deleteDoctorById(id);
        return response;
    }
}
