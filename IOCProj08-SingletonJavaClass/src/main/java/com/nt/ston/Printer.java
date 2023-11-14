package com.nt.ston;

public class Printer {
     private static Printer INSTANCE;
     
     private Printer() {
    	 System.out.println("Printer-0Param Constructer-Private");
     }
     
     public static Printer getInstance() {
    	 if(INSTANCE==null) 
    		 INSTANCE=new Printer();
    	 
    	 return INSTANCE;
     }
     
     public String print(String msg) {
    	 return msg;
     }
}
