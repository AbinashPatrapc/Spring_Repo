package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements Engine {
	
	
	public PetrolEngine() {
		System.out.println("PetrolEngine()-0ParamConst");
	}
	@Override
	public void start() {
		System.out.println("Petrol Engine Started");
	}
	
	@Override
	public void stop() {
		System.out.println("Petrol Engine Stop");
	}

}
