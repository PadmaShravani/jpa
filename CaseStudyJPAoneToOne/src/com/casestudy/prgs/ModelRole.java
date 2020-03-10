package com.casestudy.prgs;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class ModelRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int Id;

	@Basic
	@Column(name="roleName",length=50,nullable = false)
	private String roleName;

	// Constructors
	public ModelRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelRole(int roleId) {
		super();
		this.Id = roleId;
	}

	public ModelRole(int roleId, String roleName) {
		super();
		this.Id = roleId;
		this.roleName = roleName;
	}

	// Getters and Setters
	public int getRoleId() {
		return Id;
	}

	public void setRoleId(int roleId) {
		this.Id = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

		public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


}
