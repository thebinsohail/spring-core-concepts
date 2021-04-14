package com.springcore.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	/*Defining our beans here*/
	
	@Bean 
	public Details getDetails() {
		return new Details();
	}
	
	/*Injecting the details dependency into the getStudent method*/
	
		@Bean
		public Student getStudent() {
			return new Student(getDetails());
		}
	
}
