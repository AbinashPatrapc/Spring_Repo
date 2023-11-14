package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("voting")
@PropertySource("com/nt/commons/info.properties")
public class SpringbeanLifeCycle {
     
	@Value("${per.age}")
	private int age;
	@Value("${per.name}")
	private String name;
	private Date varifiedOn;
	@Value("${per.addrs}")
	private String addrs;

	
      @PostConstruct
	public void custInit() {
		System.out.println("SpringbeanLifeCycle.custInit()");
		varifiedOn = new Date();
		if (addrs == null)
			addrs = "Not Provided";

		if (name == null)
			throw new IllegalArgumentException("Please Provide Voter Name");
		else if (age < 0 || age > 100)
			throw new IllegalArgumentException("Please Provide Valid Age");
	}

	public void checkEligibility() {
		if (age > 18)
			System.out.println(
					"Hello " + name + " from" + addrs + " You are Eligible for Voting and Varified on" + varifiedOn);
		else
			System.out.println("Hello " + name + " from" + addrs + " You are not Eligible for Voting and Varified on"
					+ varifiedOn);
	}
     @PreDestroy
	public void custDestroy() {
		System.out.println("SpringbeanLifeCycle.custDestroy()");
		age = 0;
		name = null;
		varifiedOn = null;
		addrs = null;
	}
}
