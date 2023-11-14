package com.nt.src;

import com.nt.factory.CarFactory;

public class YouthCostumer {
       public static void main(String[] args) {
    	   Car car=CarFactory.createCar("sports", "OD01KH0900");
			car.drive();
	}
}
