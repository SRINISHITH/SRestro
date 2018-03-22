package com.niit.RestroBackEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfiguration {
	//test whether the user instance is created or not
	public static void main(String[] args) {
		//because we used annotation above the domain class
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		//will scan the package and check whether any classes are there inside this package
		//with annotation
		context.scan("com.niit");
		//will clear the context and create new instance of the classes which are their
		//in com.niit package with annotation
		context.refresh();
		//try to get of user class
		
		//it will return the instance if it is avaliable in
		context.getBean("User");
		
		System.out.println("successfully created instance");
	}
}
