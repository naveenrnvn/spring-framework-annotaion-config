package com.spring.demo.beans.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.demo.beans.Coach;
import com.spring.demo.beans.FortuneServce;

@Component
@Scope("prototype") // provides new instance for every request for container 
public class TrackCoach implements Coach {

	FortuneServce fortune;
	
	@Value("${coach.name}")
	String coachName;

	@Override
	public void getTraining() {
		System.out.println("runn 5K "+this.coachName);
		fortune.getFortune();
	}

	public TrackCoach(@Autowired @Qualifier("fortune") FortuneServce fort) {
		System.out.println("TrackCoach constructor");
		this.fortune = fort;
	}

	@PostConstruct
	public void init() {
		System.out.println("TrackCoach init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("TrackCoach destroy");
	}

}
