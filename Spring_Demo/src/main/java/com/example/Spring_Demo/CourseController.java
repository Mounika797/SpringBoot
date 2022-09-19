package com.example.Spring_Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController 
{
	@RequestMapping("/courses")
	public List<Course> retrieveCourses()
	{
		return Arrays.asList(
				new Course(1,"Learn AWS","in28minutes"),
				new Course(2,"Devops","in28minutes")
				);
	}

}
