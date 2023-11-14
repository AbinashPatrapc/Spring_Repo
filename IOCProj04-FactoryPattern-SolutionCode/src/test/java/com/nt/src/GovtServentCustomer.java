package com.nt.src;

import com.nt.factory.CarFactory;

public class GovtServentCustomer {
      public static void main(String[] args) {
    	  Car car=CarFactory.createCar("Budget", "OD01KH5588");
			car.drive();
	}
}
