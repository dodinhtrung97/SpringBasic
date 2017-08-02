package org.o7.spring.lang.impl;

import org.o7.spring.lang.*;

public class Vietnamese implements Language{
	
	@Override
	public String getGreeting() {
		return "Xin Chao";
	}
	
	@Override
	public String getBye() {
		return "Tam Biet";
	}
}
