package com.in28minutes.springboot.first_rest_API.user;

import jakarta.persistence.Id;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class UserDetails 
{
	@Id
	@GeneratedValue
	private long Id;
	private String name;
	private String role;
	
	public UserDetails()
	{
		
	}
	
	public UserDetails(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public long getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRole() {
		return role;
	}
	
	@Override
	public String toString() {
		return "UserDetails [Id=" + Id + ", name=" + name + ", role=" + role + "]";
	}
	
 
	
}
