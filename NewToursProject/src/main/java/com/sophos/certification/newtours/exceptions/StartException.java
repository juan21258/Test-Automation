package com.sophos.certification.newtours.exceptions;

public class StartException extends AssertionError{

	//Default version error
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_PAGE_NOT_LOADED = "The could not be loaded";
	public static final String MESSAGE_FAILED_AUTH = "Authentication Failed";
	
	public StartException(String message, Throwable cause) {
		super(message,cause);
	}
}
