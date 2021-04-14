package com.springcore.di;

public class Student {

	private Details details;

	public Student() {
		super();
	}
	
	
	//Injecting Details
	public Student(Details details) {

		super();
		this.details = details;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public void getStudentDetails() {
		this.details.setName("Anas");
		this.details.setAge(20);
		System.out.println("The Student is " + this.details.getName());
		System.out.println(this.details);
	}

}
