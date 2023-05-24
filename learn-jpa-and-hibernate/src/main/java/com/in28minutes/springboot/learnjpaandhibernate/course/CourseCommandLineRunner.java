package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner
{
	//@Autowired
	  //  private	CourseJdbcRepository repository;
	
	//@Autowired
  //  private	CourseJpaRepository repository;\
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1,"Java Core","JSpriders"));
		repository.save(new Course(2,"SrpingBoot Framework","in28minutes"));
		repository.save(new Course(3,"Web Development","Angelina"));
		
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByName("Web Development"));
	}

}

