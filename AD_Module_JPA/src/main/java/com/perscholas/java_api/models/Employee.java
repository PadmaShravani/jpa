package com.perscholas.java_api.models;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@Column(name="eid")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	
	@Basic
	@Column(name="ename")
	private String ename;
	
	@Basic
	@Column(name="salary")
	private double salary;
	
	@Basic
	@Column(name="deg")
	private String deg;
	
	public Employee() {
		super();
	}
	public Employee(String ename, double salary, String deg) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}
	public Employee(int eid, String ename, double salary, String deg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getSalary() {
		return salary;
	}
	public String getDeg() {
		return deg;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	
	

}
