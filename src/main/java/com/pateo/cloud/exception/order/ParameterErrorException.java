package com.pateo.cloud.exception.order;

public class ParameterErrorException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ParameterErrorException() {
	}
	public ParameterErrorException(String msg) {
		super(msg);
	}

}
