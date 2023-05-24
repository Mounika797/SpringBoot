package com.in28minutes.springboot.first_rest_API.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  //combination of controller and response body so by adding this we are removing controller and response body.
public class Helloworld_Resource 
{
	//hello world => "Hello World"
	@RequestMapping("/hello-world")
	//@ResponseBody
	public String helloWorld()
	{
		return "Hello World";
	}
	
	
	@RequestMapping("/hello-world-bean")
	//@ResponseBody
	public helloWorldBean helloWorldBean()
	{
		return new helloWorldBean("Hello World");
	}
	
	
	@RequestMapping("/hello-world-path-param/{name}")
	public helloWorldBean helloWorldPathParam(@PathVariable String name) 
	{
		return new helloWorldBean("Hello World, " + name);
	}
	//Path Variable or Path Parms
	//  /user/Mounika/todos/1
	
	@RequestMapping("/hello-world-path-param/{name}/message/{message}")
	//@ResponseBody
	public helloWorldBean helloWorldPathParam(@PathVariable String name, @PathVariable String message)
	{
		return new helloWorldBean("Hello World " + name + "," + message);
	}

}
