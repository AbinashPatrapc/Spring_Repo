package com.nt.vo;

public class EmployeeVo {
	private String eno;
	private String ename;
	private String desg;
	private String basicsalary;
	
	

	public EmployeeVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeVo(String eno, String ename, String desg, String basicsalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.desg = desg;
		this.basicsalary = basicsalary;
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(String basicsalary) {
		this.basicsalary = basicsalary;
	}

}
