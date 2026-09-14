package com.jpaandhibernateexample.hospital_management_db.repository;

import com.jpaandhibernateexample.hospital_management_db.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//optional- it performs the database operations and the data layer
public interface Doctorrepository extends JpaRepository<Doctor,Integer> {
}
