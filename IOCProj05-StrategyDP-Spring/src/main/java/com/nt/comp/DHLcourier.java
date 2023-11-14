package com.nt.comp;

public class DHLcourier implements Courier{
       public DHLcourier() {
    	   System.out.println("DHLcourier-0 Param Constructor");
       }
       
       @Override
       public String deliver(int oid) {
    	   return oid+"Order id Delevered By DHL Courier";
       }
}
