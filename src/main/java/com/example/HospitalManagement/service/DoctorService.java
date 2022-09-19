package com.example.HospitalManagement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HospitalManagement.user.Doctor;
import com.example.HospitalManagement.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	public DoctorRepository doctorRepo;

	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		List<Doctor> doctor = new ArrayList<>();
		doctorRepo.findAll().forEach(doctor::add);
		Collections.sort(doctor);
		return doctor;
	}

	public Doctor getDoctor(Integer id) {
		// TODO Auto-generated method stub
		try {
			return doctorRepo.findById(id).get();
		} catch (Exception e) {
			return null;
		}
	}

	public void addDoctor(Doctor doctor) {
		doctorRepo.save(doctor);
		// TODO Auto-generated method stub

	}

	public void updateDoctor(Integer id, Double salary) {
		// TODO Auto-generated method stub

		Doctor doctor = doctorRepo.findById(id).get();

		if (doctor != null) {
			doctor.setSalary(salary);
			doctorRepo.save(doctor);
		}
	}

	public void deleteDoctor(Integer id) {
		// TODO Auto-generated method stub
		doctorRepo.deleteById(id);
	}
}
