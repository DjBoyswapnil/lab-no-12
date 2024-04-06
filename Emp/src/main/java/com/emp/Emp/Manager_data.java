package com.emp.Emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Manager_data")
public class Manager_data 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "demo")
	@SequenceGenerator(name="demo",sequenceName = "demo",initialValue = 201)
	@Column(name = "Manager_Id",length =10) 
	private int Mid;
	@Column(name = "Manager_Name",length = 50)
	private String Mname;
	@Column(name = "Manger_department",length = 40)
	private String M_department;
	@Column(name = "Manager_City",length = 30)
	private String M_city;
	@Override
	public String toString() {
		return "Manager_data [Mid=" + Mid + ", Mname=" + Mname + ", M_department=" + M_department + ", M_city=" + M_city
				+ "]";
	}
	public Manager_data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager_data(int mid, String mname, String m_department, String m_city) {
		super();
		Mid = mid;
		Mname = mname;
		M_department = m_department;
		M_city = m_city;
	}
	public int getMid() {
		return Mid;
	}
	public void setMid(int mid) {
		Mid = mid;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getM_department() {
		return M_department;
	}
	public void setM_department(String m_department) {
		M_department = m_department;
	}
	public String getM_city() {
		return M_city;
	}
	public void setM_city(String m_city) {
		M_city = m_city;
	}
}
