package com.nt.src;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Flipkart fpkt=factory.getBean("fpkt", Flipkart.class);
		String resultMsg=fpkt.shoping(new String[] {"Shirt","Jeans","Cap"}, new float[] {1200.0f,2500.0f,950.0f});
		System.out.println();
		System.out.println(resultMsg);
		System.out.println();
	}

}
