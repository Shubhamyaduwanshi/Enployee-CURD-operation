package com.csipl.emp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String fname;
	private String lname;
	private String email;
	private String mobile;
	private String password;
	private int maxAttemp;
	
	
	
	
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String fname, String lname, String email, String mobile, String password,int maxAttemp) {
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.maxAttemp=maxAttemp;
	}
	public Employee(int empId, String fname, String lname, String email, String mobile, String password) {
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		
	}
	
	public int getMaxAttemp() {
		return maxAttemp;
	}

	public void setMaxAttemp(int maxAttemp) {
		this.maxAttemp = maxAttemp;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
   
}
