package com.springcore.basics;


public class Student {

	private String name;
	private int age;
	private int batch;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", batch=" + batch + "]";
	}

	
	
	
	
}
