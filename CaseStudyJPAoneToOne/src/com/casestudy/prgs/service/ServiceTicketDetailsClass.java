package com.casestudy.prgs.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.casestudy.prgs.ModelTicketDetails;

public class ServiceTicketDetailsClass {
	public void createModelTicketDetails(ModelTicketDetails newModelTicketDetails) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("CaseStudyJPA");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(newModelTicketDetails);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		entitymanagerfactory.close();
	}


}
