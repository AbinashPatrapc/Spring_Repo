package com.nt.controller;

import com.nt.dto.EmployeeDto;
import com.nt.service.EmployeeMgmtServiceImpl;
import com.nt.vo.EmployeeVo;

public class MainController {
      private EmployeeMgmtServiceImpl service;
      
      
      
      public MainController(EmployeeMgmtServiceImpl service) {
		System.out.println("MainController.1 Param constructor");
		this.service = service;
	}


	public String processEmployee(EmployeeVo vo) throws Exception {
    	  EmployeeDto dto=new EmployeeDto();
    	  dto.setEno(Integer.parseInt(vo.getEno()));
    	  dto.setEname(vo.getEname());
    	  dto.setDesg(vo.getDesg());
    	  dto.setBasicsalary(Float.parseFloat(vo.getBasicsalary()));
    	  
    	  String Result=service.registerEmployee(dto);
    	
    	  return Result;
      }
}
