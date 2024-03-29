package com.in28minutes.springboot.first_rest_API.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner
{
	
	public UserDetailsCommandLineRunner(UserDetailsRepository repository) {
		super();
		this.repository = repository;
	}

	private Logger logger = LoggerFactory.getLogger(getClass());

	private UserDetailsRepository repository;

	@Override
	public void run(String... args) throws Exception 
	{
		repository.save(new UserDetails("Mouni", "Admin"));
		repository.save(new UserDetails("Abhi", "Admin"));
		repository.save(new UserDetails("Shiva", "User"));
		
		//List<UserDetails> users = repository.findAll();
		
		List<UserDetails> users = repository.findByRole("Admin");
		users.forEach(user -> logger.info(user.toString()));
		
		
		
	}

	
    
}
