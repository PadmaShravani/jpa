package com.casestudy.prgs;

public class ModelServiceDepartment {
	private int serviceId;
	private int departmentId;
	
	//Constructors
	public ModelServiceDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ModelServiceDepartment(int serviceId, int departmentId) {
		super();
		this.serviceId = serviceId;
		this.departmentId = departmentId;
	}

	//Getters and Setters
	
	public int getServiceId() {
		return serviceId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	

	
}
