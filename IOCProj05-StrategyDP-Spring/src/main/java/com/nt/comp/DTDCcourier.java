package com.nt.comp;

public class DTDCcourier implements Courier{
       public DTDCcourier() {
    	   System.out.println("DTDCcourier-0Param Constructor");
       }
       
       public String deliver(int oid) {
    	   return oid+"order id delevered by DTDC";
       }
}
