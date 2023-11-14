package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	public Flipkart() {
		System.out.println("Flipkart-0 Param Constructor");
	}
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	public String shoping(String[] items,float[] price) {
		float billAmt=0.0f;
		for(int i=0;i<items.length;i++) {
			billAmt+=price[i];
		}
			int oid=new Random().nextInt(10000);
			String Status=courier.deliver(oid);
			String finalMsg=Arrays.toString(items)+"are purchased With Price"+Arrays.toString(price)+", and the generated Bill Amount is "+billAmt;
			System.out.println();
	
		return finalMsg+"......."+Status;
	}

}
