package com.casestudy.prgs;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TicktDetails")
public class ModelTicketDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ticketId;
	@Basic
	@Column(nullable=false,length=50)
	private String ticketType;
	@Basic
	@Column
	private int userId;
	@Basic
	@Column(nullable=false,length=50)
	private String complaintType;
	@Basic
	@Column(nullable=false,length=250)
	private String description;
	@Basic
	@Column(nullable=false,length=250)
	private String geoLocation;
	@Basic
	@Column
	private String photo;
	@Basic
	@Column(nullable=false,length=50)
	private String city;
	@Basic
	@Column
	private String street;
	@Basic
	@Column
	private int zipCode;
	@Basic
	@Column(nullable=false,length=10)
	private String status;
	@Basic
	@Column
	private int serviceId;
	@Basic
	@Column
	private String gender;
	
	//Constructors
	public ModelTicketDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ModelTicketDetails(int ticketId, String ticketType, int userId, String complaintType, String description,
			String geoLocation, String photo, String status, int serviceId) {
		super();
		this.ticketId = ticketId;
		this.ticketType = ticketType;
		this.userId = userId;
		this.complaintType = complaintType;
		this.description = description;
		this.geoLocation = geoLocation;
		this.photo = photo;
		this.status = status;
		this.serviceId = serviceId;
	}

	public ModelTicketDetails(int ticketId, String ticketType, int userId, String complaintType, String description,
			String geoLocation, String photo, String city, String street, int zipCode, String status, int serviceId,
			String gender) {
		super();
		this.ticketId = ticketId;
		this.ticketType = ticketType;
		this.userId = userId;
		this.complaintType = complaintType;
		this.description = description;
		this.geoLocation = geoLocation;
		this.photo = photo;
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
		this.status = status;
		this.serviceId = serviceId;
		this.gender = gender;
	}


	//Getters and Setters
	public int getTicketId() {
		return ticketId;
	}
	
	public String getTicketType() {
		return ticketType;
	}
	public int getUserId() {
		return userId;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public String getDescription() {
		return description;
	}
	public String getGeoLocation() {
		return geoLocation;
	}
	public String getPhoto() {
		return photo;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public int getZipCode() {
		return zipCode;
	}
	public String getStatus() {
		return status;
	}
	public int getServiceId() {
		return serviceId;
	}
	public String getGender() {
		return gender;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
