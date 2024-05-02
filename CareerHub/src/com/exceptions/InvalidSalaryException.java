package com.exceptions;

public class InvalidSalaryException extends Exception{
	
private String message;
	

	public InvalidSalaryException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	private static final long serialVersionUID = 321541011146474208L;

}
