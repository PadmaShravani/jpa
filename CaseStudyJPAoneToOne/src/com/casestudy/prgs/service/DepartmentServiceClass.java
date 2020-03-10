package com.casestudy.prgs.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.casestudy.prgs.ModelDepartment;

public class DepartmentServiceClass {

	public void createModelDepartment(ModelDepartment newModelDepartment) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("CaseStudyJPA");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(newModelDepartment);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		entitymanagerfactory.close();
	}
}
