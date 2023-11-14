package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.SpringbeanLifeCycle;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/ApplicationContext.xml");
		SpringbeanLifeCycle voting = ctx.getBean("voting", SpringbeanLifeCycle.class);
		voting.checkEligibility();
         
		ctx.close();
	}

}
