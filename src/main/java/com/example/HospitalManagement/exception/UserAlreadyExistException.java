package com.example.HospitalManagement.exception;

public class UserAlreadyExistException extends RuntimeException {

	public UserAlreadyExistException(String message)
	{
		super(message);
	}
}