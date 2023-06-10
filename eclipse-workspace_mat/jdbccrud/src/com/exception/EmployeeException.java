package com.exception;

public class EmployeeException extends Exception{

	private String errorMessage;

	public EmployeeException() {
		super();
	}

	public EmployeeException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
