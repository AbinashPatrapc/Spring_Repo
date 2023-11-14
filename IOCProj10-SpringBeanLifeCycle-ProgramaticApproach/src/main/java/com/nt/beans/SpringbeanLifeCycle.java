package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringbeanLifeCycle implements InitializingBean,DisposableBean {

	private int age;
	private String name;
	private Date varifiedOn;
	private String addrs;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public void checkEligibility() {
		if (age > 18)
			System.out.println(
					"Hello " + name + " from" + addrs + " You are Eligible for Voting and Varified on" + varifiedOn);
		else
			System.out.println("Hello " + name + " from" + addrs + " You are not Eligible for Voting and Varified on"
					+ varifiedOn);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("SpringbeanLifeCycle.destroy()");
		age = 0;
		name = null;
		varifiedOn = null;
		addrs = null;

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("SpringbeanLifeCycle.afterPropertiesSet()");
		varifiedOn = new Date();
		if (addrs == null)
			addrs = "Not Provided";

		if (name == null)
			throw new IllegalArgumentException("Please Provide Voter Name");
		else if (age < 0 || age > 100)
			throw new IllegalArgumentException("Please Provide Valid Age");
		
	}
}
