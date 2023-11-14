package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBo;

public class EmployeeOracleDaoImpl implements IEmployeeDao {
	private static final String INSERT_EMP="INSERT INTO SPRING_EMPLOYEE VALUES(?,?,?,?,?,?)";
	private DataSource ds;
	

	public EmployeeOracleDaoImpl(DataSource ds) {
		System.out.println("EmployeeOracleDaoImpl.1-param constructor");
		this.ds = ds;
	}
	

	@Override
	public int insertEmployee(EmployeeBo bo) throws Exception {
		int result=0;
		//System.out.println("EmployeeOracleDaoImpl.insertEmployee()");
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(INSERT_EMP);){
			
			if(con!=null) 
				System.out.println("Connection established");
			else
				System.out.println("Failed to connect");
			
			ps.setInt(1,bo.getEno());
			System.out.println(bo.getEname());
			ps.setString(2,bo.getEname());
			System.out.println(bo.getDesg());
			ps.setString(3,bo.getDesg());
			System.out.println(bo.getBasicsalary());
			ps.setFloat(4,bo.getBasicsalary());
			System.out.println(bo.getGrosssalary());
			ps.setFloat(5,bo.getGrosssalary());
			System.out.println(bo.getNetsalary());
			ps.setFloat(6,bo.getNetsalary());
			
			result=ps.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw e;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return result;
	}

}
