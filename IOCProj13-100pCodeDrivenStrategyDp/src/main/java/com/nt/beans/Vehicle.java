package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("vehicle")
public class Vehicle {
    @Autowired
    @Qualifier("petrol")
	private Engine eng;
    
    public Vehicle() {
    	System.out.println("Vehicle 0-Param Constructor");
    }
	
	public void journey(String start, String dest) {
		eng.start();
		System.out.println("Journey started from "+start);
		eng.stop();
		System.out.println("Reached the Destination "+dest);
		
	}
	
}
