package com.telusko.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.telusko"})
public class JavaConfiguraton {

	public JavaConfiguraton() {
		System.out.println("Java configuration bean is created.....");
	}
	@Bean
	public LocalDateTime getDateTime() {
		return LocalDateTime.now();
	}

}
