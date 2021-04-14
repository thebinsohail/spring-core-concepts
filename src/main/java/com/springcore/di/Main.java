package com.springcore.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// Defining our configuration file for IOC Container Magic
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		// Getting the bean
		Student student = (Student) context.getBean("getStudent", Student.class);
		// getting the details of the student
		student.getStudentDetails();
		
		//closing the context
		context.close();
	}

}
