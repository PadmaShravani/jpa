package com.casestudy.prgs.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.casestudy.prgs.ModelUsers;

public class UsersServiceClass {
	public void createModelUsers(ModelUsers newModelUsers) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("CaseStudyJPA");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(newModelUsers);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		entitymanagerfactory.close();
	}
}
