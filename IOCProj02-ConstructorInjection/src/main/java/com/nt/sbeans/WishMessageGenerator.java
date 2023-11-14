package com.nt.sbeans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
       public WishMessageGenerator(Date date) {
    	   this.date=date;
       }
       
       public void generateMessage(String user) {
    	   int hour=date.getHours();
    	   
    	   if(hour<12) 
    		   System.out.println("Good Morning "+user);
    	   else if(hour<19)
    		   System.out.println("Good AfterNoon "+user);
    	   else
    		   System.out.println("Good Night "+user);
       }
}
