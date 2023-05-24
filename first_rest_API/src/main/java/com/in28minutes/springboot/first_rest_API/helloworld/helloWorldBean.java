package com.in28minutes.springboot.first_rest_API.helloworld;

public class helloWorldBean 
{
	private String message;

	public helloWorldBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "helloWorldBean [message=" + message + "]";
	}
	
	

}
