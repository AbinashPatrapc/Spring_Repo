package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVo;

public class RealtimeDITest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get SpringBean class obj ref
		MainController controller=factory.getBean("control",MainController.class);
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Employee No:");
			String eno=sc.next();
			System.out.print("Enter Employee Name::");
			String ename=sc.next();
			System.out.print("Enter Employee Designation::");
			String desg=sc.next();
			System.out.print("Enter Your Basic Salary::");
			String basicSalary=sc.next();
			
			EmployeeVo vo=new EmployeeVo();
			vo.setEno(eno);
			vo.setEname(ename);
			vo.setDesg(desg);
			vo.setBasicsalary(basicSalary);
			
			try {
				String result=controller.processEmployee(vo);
				System.out.println(result);
			}catch(Exception e) {
				System.out.println("Internal Problem-->"+e.getMessage());
			}
		}
		
		

	}

}
