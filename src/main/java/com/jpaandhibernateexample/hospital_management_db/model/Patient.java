package com.jpaandhibernateexample.hospital_management_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="patient")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @Column(name="id")
    private int id;

    @Column(name = "patient_name",nullable = false)//nullable =fales , cannot be null
    private String name;

    @Column(name = "email",nullable = false,unique = true)//unique= cannot contain duplicate
    private String email;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "heath_issue",nullable = false)
    private String healthIssue;

    @Column(name = "mobileno",nullable = false,unique = true)
    private String mobileno;


}
