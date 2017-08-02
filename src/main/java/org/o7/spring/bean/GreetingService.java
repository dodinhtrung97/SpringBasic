package org.o7.spring.bean;

import org.o7.spring.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	@Autowired
	private Language language;
	
	public GreetingService() {}
	
	public void sayGreeting() {
		
		String greeting = language.getGreeting();
		System.out.println("Greeting: " + greeting);
	}
}
