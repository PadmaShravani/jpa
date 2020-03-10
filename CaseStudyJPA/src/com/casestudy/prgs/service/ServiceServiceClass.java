package com.casestudy.prgs.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.casestudy.prgs.ModelService;

public class ServiceServiceClass {
	public void createModelService(ModelService newModelService) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("CaseStudyJPA");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(newModelService);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		entitymanagerfactory.close();
	}

}
