package com.springcore.di;

public class Details {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		this.age = i;
	}

	@Override
	public String toString() {
		return "Details [name=" + name + ", age=" + age + "]";
	}

	
	
}
