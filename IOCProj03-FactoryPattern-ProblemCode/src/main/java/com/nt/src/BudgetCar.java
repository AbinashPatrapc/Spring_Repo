package com.nt.src;

public class BudgetCar extends Car {
	private String regNo;
	
	public BudgetCar(String regNo) {
		this.regNo = regNo;
	}
	@Override
	public void drive() {
		System.out.println("You are Driving Budget Car With Regdno: "+regNo);
	}

}
