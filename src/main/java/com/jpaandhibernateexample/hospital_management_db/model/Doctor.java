package com.jpaandhibernateexample.hospital_management_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity// it represents that this class is entity or model class which is directly creating obj
@Table(name = "doctor")//it will create a table inside database with name given
@Data// adds getters and setters
@AllArgsConstructor// paramiterised contrustor
@NoArgsConstructor//default construtors

public class Doctor {
    @Id//primary key of the table unique and not null
    @Column(name = "id")//
    private int id;

    @Column(name = "doctor_name",nullable = false)//nullable =fales , cannot be null
    private String name;

    @Column(name = "email",nullable = false,unique = true)//unique= cannot contain duplicate
    private String email;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "specialization",nullable = false)
    private String specialization;

    @Column(name = "mobileno",nullable = false,unique = true)
    private String mobileno;

}