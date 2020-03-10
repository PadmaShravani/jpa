package com.casestudy.prgs;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class ModelDepartment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int Id;
	@Basic
	@Column(name="departmentName",length=50)
	private String departmentName;
	@Basic
	@Column(name="departmentEmail",length=100)
	private String departmentEmail;
	@Basic
	@Column(name="departmentHeadEmail",length=100)
	private String departmentHeadEmail;
	
	//Constructors
	public ModelDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ModelDepartment(int departmentId, String departmentName, String departmentEmail) {
		super();
		this.Id = departmentId;
		this.departmentName = departmentName;
		this.departmentEmail = departmentEmail;
	}
	public ModelDepartment(int departmentId, String departmentName, String departmentEmail,
			String departmentHeadEmail) {
		super();
		this.Id = departmentId;
		this.departmentName = departmentName;
		this.departmentEmail = departmentEmail;
		this.departmentHeadEmail = departmentHeadEmail;
	}

	//Getters and Setters
	public int getDepartmentId() {
		return Id;
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
		this.Id = departmentId;
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
	
	
	
	
}
