package com.perscholas.java_api.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.perscholas.java_api.models.Employee;

public class EmployeeService {
	public void createEmployee(Employee newEmployee) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("AD_Module_JPA");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(newEmployee);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		entitymanagerfactory.close();
	//	return newEmployee.getEid();
	}
	
	public static void main(String[] args) {
		Employee e =new Employee("eOne2",750000,"bba");
		EmployeeService es=new EmployeeService();
		es.createEmployee(e); 
	//	Integer generatedId=es.createEmployee(e);
	//	System.out.println(generatedId);
	}
}

