package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Vehicle;
import com.nt.config.AppConfig;

public class VehicleTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle d1=ctx.getBean("vehicle",Vehicle.class);
        d1.journey("Hyderabad", "Odisha");
        ctx.close();
	}

}
