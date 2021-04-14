package com.springcore.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(PersonConfig.class);
		
		Person p1=(Person)context.getBean("person",Person.class);
		System.out.println(p1.personAddress());
	}

}
