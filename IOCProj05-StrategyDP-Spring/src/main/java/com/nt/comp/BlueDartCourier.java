package com.nt.comp;

public class BlueDartCourier implements Courier {
	public BlueDartCourier() {
	
		System.out.println("BlueDartCourier-0 Param Constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return oid+"OrderId develevered by BlueDart Courier";
	}

}
