package com.spring.demo.beans.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.demo.beans.FortuneServce;

@Component //registering as bean
@Primary  // when two or more classes implements same interface provide a default bean implemetation
@Scope("singleton") //bean scope only one instance for the container
public class BadFortuneService implements FortuneServce {

	@Override
	public void getFortune() {
		System.out.println("Your Day is GONNA BAAAD!!!!!");
	}
	
	public BadFortuneService() {
		System.out.println("Bad Fortune constructor");
	}

}
