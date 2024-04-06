package com.emp.Emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Department_data")
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "demo")
	@SequenceGenerator(name="demo",sequenceName = "demo",initialValue = 301)
	@Column(name = "Department_Id",length =10)
	private int D_id;
	private String D_name;
	//private int m_id;
	//private int emp_id;
	public int getD_id() {
		return D_id;
	}
	public void setD_id(int d_id) {
		D_id = d_id;
	}
	public String getD_name() {
		return D_name;
	}
	public void setD_name(String d_name) {
		D_name = d_name;
	}
	public Department(int d_id, String d_name) {
		super();
		D_id = d_id;
		D_name = d_name;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [D_id=" + D_id + ", D_name=" + D_name + "]";
	}
}