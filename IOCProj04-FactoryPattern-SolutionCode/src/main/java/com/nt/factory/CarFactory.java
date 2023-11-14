package com.nt.factory;

import com.nt.src.BudgetCar;
import com.nt.src.Car;
import com.nt.src.LuxuryCar;
import com.nt.src.SportsCar;

public class CarFactory {
       public static Car createCar(String type,String regNo) {
    	   if(type.equalsIgnoreCase("budget"))
    		   return new BudgetCar(regNo);
    	   else if(type.equalsIgnoreCase("luxury"))
    		   return new LuxuryCar(regNo);
    	   else if(type.equalsIgnoreCase("sports"))
    		   return new SportsCar(regNo);
    	   else
    		   throw new IllegalArgumentException("Invalid Cars Type");
    	   
       }
}
