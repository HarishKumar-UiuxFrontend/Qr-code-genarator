package com.exception;

public class StudentException extends Exception {

	private String errorMessage;

	public String getMessage() {

		return this.errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public StudentException() {
		super();
	}

	public StudentException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
}
