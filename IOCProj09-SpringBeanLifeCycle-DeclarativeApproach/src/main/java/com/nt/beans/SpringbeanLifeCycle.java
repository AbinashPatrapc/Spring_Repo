package com.nt.beans;

import java.util.Date;

public class SpringbeanLifeCycle {

	private int age;
	private String name;
	private Date varifiedOn;
	private String addrs;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public void myInit() {
		System.out.println("SpringbeanLifeCycle.myInit()");
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

	public void myDestroy() {
		System.out.println("SpringbeanLifeCycle.myDestroy()");
		age = 0;
		name = null;
		varifiedOn = null;
		addrs = null;
	}
}
