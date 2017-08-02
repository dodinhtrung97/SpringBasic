package org.o7.spring.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	public String getAppName() {
		return "Hello Spring App";
	}
	
	public Date getSystemDateTime() {
		return new Date();
	}
}