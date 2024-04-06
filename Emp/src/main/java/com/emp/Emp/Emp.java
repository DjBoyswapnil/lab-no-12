package com.emp.Emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Data")
public class Emp 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "demo")
	@SequenceGenerator(name="demo",sequenceName = "demo",initialValue = 101)
	@Column(name = "Emp_Id",length =10) 
	private int Empid;
	@Column(name = "Emp_Name",length = 50)
	private String Ename;
	@Column(name = "Emp_Salary",length = 40)
	private int Esal;
	//@Column(name = "Manager_Id",length =50)
	//private int Mid;
	//@Column(name = "Department_Id",length = 60)
	//@JoinColumn(name = "Manager_Id")
	//private int Did;
	//@Column(name = "")
	public int getEmpid() {
		return Empid;
	}
	@Override
	public String toString() {
		return "Emp [Empid=" + Empid + ", Ename=" + Ename + ", Esal=" + Esal + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empid, String ename, int esal) {
		super();
		Empid = empid;
		Ename = ename;
		Esal = esal;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEsal() {
		return Esal;
	}
	public void setEsal(int esal) {
		Esal = esal;
	}
}