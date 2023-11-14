package com.nt.src;

import com.nt.factory.CarFactory;

public class BussinesManCustomer {
          public static void main(String[] args) {
			Car car=CarFactory.createCar("Luxury", "OD01KH0900");
			car.drive();
		}
}
