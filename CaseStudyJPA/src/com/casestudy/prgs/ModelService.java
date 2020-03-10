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
@Table(name = "Service")
public class ModelService {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serviceId;
	@Basic
	@Column( length = 50)
	private String description;
	@Basic
	@Column(nullable = false, length = 50)
	private String status;
	@Basic
	@Column(nullable = false, length = 10)
	private int level;
	@Basic
	@Column
	private int departmentId;

	@OneToMany(targetEntity = ModelTicketDetails.class)
	private List<ModelTicketDetails> listOfTickets;

	// Constructors
	public ModelService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelService(int serviceId, String description, String status, int level) {
		super();
		this.serviceId = serviceId;
		this.description = description;
		this.status = status;
		this.level = level;
	}

	public ModelService(int serviceId, String description, String status, int level, int departmentId) {
		super();
		this.serviceId = serviceId;
		this.description = description;
		this.status = status;
		this.level = level;
		this.departmentId = departmentId;
	}

	public ModelService(int serviceId, String description, String status, int level, int departmentId,
			List<ModelTicketDetails> listOfTickets) {
		super();
		this.serviceId = serviceId;
		this.description = description;
		this.status = status;
		this.level = level;
		this.departmentId = departmentId;
		this.listOfTickets = listOfTickets;
	}

	// Getters and Setters
	public int getServiceId() {
		return serviceId;
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
		this.serviceId = serviceId;
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

	public int getDepartmentId() {
		return departmentId;
	}

	public List<ModelTicketDetails> getListOfTickets() {
		return listOfTickets;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public void setListOfTickets(List<ModelTicketDetails> listOfTickets) {
		this.listOfTickets = listOfTickets;
	}

}
