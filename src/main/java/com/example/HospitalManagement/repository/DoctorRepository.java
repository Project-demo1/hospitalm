package com.example.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HospitalManagement.user.Doctor;
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}