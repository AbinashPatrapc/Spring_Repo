package com.nt.src;

public class SportsCar extends Car {
	public SportsCar(String regNo) {
		super();
		this.regNo = regNo;
	}
   private String regNo;
	

	@Override
	public void drive() {
		System.out.println("You are Driving Sports Car With Regdno: "+regNo);
	}

}
