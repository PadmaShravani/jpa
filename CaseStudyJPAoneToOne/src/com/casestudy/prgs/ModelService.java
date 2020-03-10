package com.casestudy.prgs;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Service")
public class ModelService {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int Id;
	@Basic
	@Column(name="description")
	private String description;
	@Basic
	@Column(name="status",length=20)
	private String status;
	@Basic
	@Column(name="level",length=10,nullable = false)
	private int level;

	 @OneToOne
	   private ModelDepartment department;

	// Constructors
	public ModelService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelService(int serviceId, String description, String status, int level) {
		super();
		this.Id = serviceId;
		this.description = description;
		this.status = status;
		this.level = level;
	}

	// Getters and Setters
	public int getServiceId() {
		return Id;
	}

	public String getDescription() {
		return description;
	}

	public String getStatus() {
		return status;
	}

	public int getLevel() {
		return level;
	}

	public void setServiceId(int serviceId) {
		this.Id = serviceId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ModelDepartment getDepartmentId() {
		return department;
	}

	public void setDepartmentId(ModelDepartment departmentId) {
		this.department = departmentId;
	}


}
