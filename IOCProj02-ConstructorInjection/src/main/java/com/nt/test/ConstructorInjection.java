package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.sbeans.WishMessageGenerator;

public class ConstructorInjection {
	public static void main(String[] args) {
		//FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		ClassPathResource res=new ClassPathResource("applicationContext.xml"); 
		XmlBeanFactory factory=new XmlBeanFactory(res);
		 
		 Object obj=factory.getBean("wmg");
		 
		 WishMessageGenerator generator=(WishMessageGenerator)obj;
		 generator.generateMessage("Abinash");
		// System.out.println("Wish Message Is:" result);
	}

}
