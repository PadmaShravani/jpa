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
@Table(name = "Role")
public class ModelRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;
	@Basic
	@Column(nullable = false, length = 50)
	private String roleName;

	@OneToMany(targetEntity = ModelUsers.class)
	private List<ModelUsers> mUsers;

	// Constructors
	public ModelRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelRole(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public ModelRole(int roleId, String roleName, List<ModelUsers> mUsers) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.mUsers = mUsers;
	}

	// Getters and Setters
	public int getRoleId() {
		return roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<ModelUsers> getmUsers() {
		return mUsers;
	}

	public void setmUsers(List<ModelUsers> mUsers) {
		this.mUsers = mUsers;
	}

}
