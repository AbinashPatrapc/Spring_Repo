package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

public class WishMessageTestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		String result = generator.wishGenerator("Abinash");
		System.out.println(result);
		ctx.close();
	}

}
