package com.tmf.eps.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	private String empname,emppassword,empEmail,empaddress,gender;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int empId;
	
	public Employee() {}
	
	public Employee(String empname, String emppassword, String empEmail, String empaddress, String gender, int empId,
			long empphone) {
		super();
		this.empname = empname;
		this.emppassword = emppassword;
		this.empEmail = empEmail;
		this.empaddress = empaddress;
		this.gender = gender;
		this.empId = empId;
		this.empphone = empphone;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", emppassword=" + emppassword + ", empEmail=" + empEmail
				+ ", empaddress=" + empaddress + ", gender=" + gender + ", empId=" + empId + ", empphone=" + empphone
				+ "]";
	}
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	public long getEmpphone() {
		return empphone;
	}
	public void setEmpphone(long empphone) {
		this.empphone = empphone;
	}
	private long empphone;
	
}
