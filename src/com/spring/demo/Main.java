package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.beans.Coach;
import com.spring.demo.beans.FortuneServce;

public class Main {

	public static void main(String[] args) {
		
		//initialize spring context/factory
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurartions.class);
		
		//get bean from spring factory by bean name
		Coach coach = context.getBean("trackCoach",Coach.class);
		coach.getTraining();
		
		///get bean from spring factory by SuperType / interface
		Coach coach1 = context.getBean(Coach.class);
		FortuneServce forturn = context.getBean(FortuneServce.class);
		FortuneServce forturn1 = context.getBean(FortuneServce.class);
		forturn.getFortune();
		
		//shutdown spring context/factory
		context.close();

	}

}
