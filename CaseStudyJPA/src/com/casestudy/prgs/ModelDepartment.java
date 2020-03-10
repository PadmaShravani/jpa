package com.casestudy.prgs;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class ModelDepartment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int departmentId;
	@Basic
	@Column(nullable=false,length=50)
	private String departmentName;
	@Basic
	@Column(nullable=false,length=50)
	private String departmentEmail;
	@Basic
	@Column(nullable=false,length=50)
	private String departmentHeadEmail;

	@OneToMany(targetEntity = ModelService.class)
	private List<ModelService> listOfServices;
	
	//Constructors
	public ModelDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ModelDepartment(int departmentId, String departmentName, String departmentEmail,
			String departmentHeadEmail) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentEmail = departmentEmail;
		this.departmentHeadEmail = departmentHeadEmail;
	}

	//Getters and Setters
	public int getDepartmentId() {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getDepartmentEmail() {
		return departmentEmail;
	}
	public String getDepartmentHeadEmail() {
		return departmentHeadEmail;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public ModelDepartment(int departmentId, String departmentName, String departmentEmail, String departmentHeadEmail,
			List<ModelService> listOfServices) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentEmail = departmentEmail;
		this.departmentHeadEmail = departmentHeadEmail;
		this.listOfServices = listOfServices;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public void setDepartmentEmail(String departmentEmail) {
		this.departmentEmail = departmentEmail;
	}
	public void setDepartmentHeadEmail(String departmentHeadEmail) {
		this.departmentHeadEmail = departmentHeadEmail;
	}
	public List<ModelService> getListOfServices() {
		return listOfServices;
	}
	public void setListOfServices(List<ModelService> listOfServices) {
		this.listOfServices = listOfServices;
	}

	
	
}
