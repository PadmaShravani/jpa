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
@Table(name="Users")
public class ModelUsers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	@Basic
	@Column(nullable=false,length=50)
	private String userName;
	@Basic
	@Column(nullable=false,length=50)
	private String password;
	@Basic
	@Column(nullable=false,length=50)
	private String fullName;
	@Basic
	@Column(nullable=false,length=50)
	private String email;
	@Basic
	@Column(nullable=false,length=50)
	private String dateOfBirth;
	@Basic
	@Column
	private int roleId;
	
	@OneToMany(targetEntity = ModelTicketDetails.class)
	private List<ModelTicketDetails> mTickets;
	
	//Constructors and methods
	//for login
	public void login() {
	}
	//for Sign up
	public void createNewUser() {
		
	}
	//to save user details 
	public void saveuser() {
		
	}
	
	public ModelUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ModelUsers(int userId, String userName, String password, String fullName, String email, String dateOfBirth,
			int roleId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.roleId = roleId;
	}
	public ModelUsers(int userId, String userName, String password, String fullName, String email, String dateOfBirth,
			int roleId, List<ModelTicketDetails> mTickets) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.roleId = roleId;
		this.mTickets = mTickets;
	}
	//Getters and Setters
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getFullName() {
		return fullName;
	}
	public String getEmail() {
		return email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public List<ModelTicketDetails> getmTickets() {
		return mTickets;
	}
	public void setmTickets(List<ModelTicketDetails> mTickets) {
		this.mTickets = mTickets;
	}
	

	
	
	
}
