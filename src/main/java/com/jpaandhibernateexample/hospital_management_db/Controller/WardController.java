package com.jpaandhibernateexample.hospital_management_db.Controller;

import com.jpaandhibernateexample.hospital_management_db.model.Doctor;
import com.jpaandhibernateexample.hospital_management_db.model.Ward;
import com.jpaandhibernateexample.hospital_management_db.service.Doctorservice;
import com.jpaandhibernateexample.hospital_management_db.service.Wardservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ward/apis")
public class WardController {
    @Autowired
    Wardservice wardService;

    @PostMapping("/save")
    public String saveWard(@RequestBody Ward ward){
        String response = wardService.addWard(ward);
        return response;
}}
