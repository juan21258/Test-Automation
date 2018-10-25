package com.sophos.certification.viajesexito.exceptions;

public class InvalidOption extends AssertionError{

	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_INVALID_OPTION = "The requested option is not valid";
	
	public InvalidOption(String message, Throwable cause) {
		super(message,cause);
	}
}
