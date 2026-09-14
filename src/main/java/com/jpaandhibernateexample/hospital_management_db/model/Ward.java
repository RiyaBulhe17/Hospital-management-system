package com.jpaandhibernateexample.hospital_management_db.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="ward")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ward {
    @Id
    @Column(name="id")
    private int id;

    @Column(name = "ward_name",nullable = false)//nullable =fales , cannot be null
    private String name;

    @Column(name = "ward_no",nullable = false,unique = true)//unique= cannot contain duplicate
    private String ward_no;

    @Column(name = "number_of_patients", nullable = false)
    private String patient_no;

    @Column(name = "intake_capacity",nullable = false)
    private String intake;

    @Column(name = "doctor_assigned",nullable = false,unique = true)
    private String doctorassign;

}
