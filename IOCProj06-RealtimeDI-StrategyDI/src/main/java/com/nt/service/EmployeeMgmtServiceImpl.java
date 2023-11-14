package com.nt.service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.IEmployeeDao;
import com.nt.dto.EmployeeDto;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	private IEmployeeDao dao; 

	public EmployeeMgmtServiceImpl(IEmployeeDao dao) {
		System.out.println("EmployeeMgmtServiceImpl-1 param Constructor");
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDto dto) throws Exception {
		//Calculating grossSalary and netSalary 
		float grossSalary=dto.getBasicsalary()+(dto.getBasicsalary()*0.4f);
		float netSalary=grossSalary-(dto.getBasicsalary()*0.2f);
		
		//Converting DTO class Data to BO class
		EmployeeBo bo=new EmployeeBo();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicsalary(dto.getBasicsalary());
		bo.setGrosssalary(grossSalary);
		bo.setNetsalary(netSalary);
		
		//calling DAO class method by passing Bo class Object
		int count=dao.insertEmployee(bo);
		

		return count==1? "Employee Data Inserted Successfully":"Failed To insert Employee data";
	

     }
}
