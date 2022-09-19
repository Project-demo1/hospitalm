package com.example.HospitalManagement.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.HospitalManagement.service.DoctorService;

@Entity
@Table(name="Doctor_details")
public class Doctor implements Comparable<Doctor> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double salary;
	private String specialist;
	
	public Doctor(Integer id, String name, double salary, String specialist) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.specialist = specialist;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	@Override
	public int compareTo(Doctor o) {
	
		if(this.salary != o.salary)
		{
			if(this.salary > o.salary)
			  return -1;
			else 
			  return 1;
		}
		else
		{
		  return this.name.compareTo(o.name);
		}
		
	}
	
	
	
	
	
	

}