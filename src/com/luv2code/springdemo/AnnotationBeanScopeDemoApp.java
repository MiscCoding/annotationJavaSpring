package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// check if they are the same result
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object" + result);
		
		System.out.println("\nMemory location for theCoach" + theCoach);
		
		System.out.println("\nMemory location for alphaCoach" + alphaCoach + "\n");
		
		context.close();
		
	}

}