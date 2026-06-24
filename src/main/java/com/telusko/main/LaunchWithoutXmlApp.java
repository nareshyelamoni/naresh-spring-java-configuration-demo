package com.telusko.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.config.JavaConfiguraton;
import com.telusko.service.Greetings;

public class LaunchWithoutXmlApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(JavaConfiguraton.class);
		Greetings greet = container.getBean(Greetings.class);
		System.out.println(greet.generateGreetings("Naresh"));
	}
}
