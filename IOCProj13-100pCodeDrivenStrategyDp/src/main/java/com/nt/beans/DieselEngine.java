package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("Diesel")
public class DieselEngine implements Engine {
	
	
	public DieselEngine() {
		System.out.println("DieselEngine()-0ParamConst");
	}
	@Override
	public void start() {
		System.out.println("Diesel Engine Started");
	}
    @Override
    public void stop() {
    	System.out.println("Diesel Engine Stopped");
    }

}
