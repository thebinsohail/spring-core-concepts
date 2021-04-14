package com.springcore.annotations;

import org.springframework.stereotype.Component;

@Component
public class Person implements Address {

	public String personAddress() {

		return "Karachi, Pakistan!";

	}

}
