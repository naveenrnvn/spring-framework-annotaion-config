package com.spring.demo.beans.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.spring.demo.beans.FortuneServce;

public class GoodFortuneService implements FortuneServce {

	@Override
	public void getFortune() {
		
		System.out.println("you have very good fortune Today");

	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean destroy");
	}

}
