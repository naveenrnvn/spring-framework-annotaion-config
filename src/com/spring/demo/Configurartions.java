package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.demo.beans.FortuneServce;
import com.spring.demo.beans.impl.GoodFortuneService;

@ComponentScan("com.spring.demo")
@Configuration
@PropertySource("classpath:resources/application.properties")
public class Configurartions {

	
	@Bean
	public FortuneServce fortune() {
		return new GoodFortuneService();
	}
	
	
	
  
}
