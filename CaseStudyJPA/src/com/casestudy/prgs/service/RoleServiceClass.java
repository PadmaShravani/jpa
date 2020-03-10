package com.casestudy.prgs.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.casestudy.prgs.ModelRole;

public class RoleServiceClass {
	public void createModelRole(ModelRole newModelRole) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("CaseStudyJPA");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(newModelRole);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		entitymanagerfactory.close();
	}

}
