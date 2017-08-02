package org.o7.spring.lang.impl;

import org.o7.spring.lang.*;

public class English implements Language{
	
	@Override
	public String getGreeting() {
		return "Hello";
	}
	
	@Override
	public String getBye() {
		return "Bye";
	}
	
}
