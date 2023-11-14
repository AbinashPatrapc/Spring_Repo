package com.nt.src;

public class LuxuryCar extends Car {
      private String regNo;
      
	public LuxuryCar(String regNo) {
		super();
		this.regNo = regNo;
	}

	@Override
	public void drive() {
		System.out.println("You are Driving Luxury Car With Regdno: "+regNo);

	}

}
