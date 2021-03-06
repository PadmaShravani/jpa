package com.tutorialspoint.eclipselink.entity.service;

	import java.util.HashSet;
	import java.util.Set;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	import com.tutorialspoint.eclipselink.entity.Class;
	import com.tutorialspoint.eclipselink.entity.Teacher;

	public class ManyToMany {
	   public static void main(String[] args) {
	   
	   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	   EntityManager entitymanager = emfactory.createEntityManager( );
	   entitymanager.getTransaction( ).begin( );

	   //Create Class Entity
	   Class class1 = new Class(0, "1st", null);
	   Class class2 = new Class(0, "2nd", null);
	   Class class3 = new Class(0, "3rd", null);

	   //Store Class
	   entitymanager.persist(class1);
	   entitymanager.persist(class2);
	   entitymanager.persist(class3);

	   //Create Class Set1
	   Set<Class> classSet1 = new HashSet();
	   classSet1.add(class1);
	   classSet1.add(class2);
	   classSet1.add(class3);

	   //Create Class Set2
	   Set<Class> classSet2 = new HashSet();
	   classSet2.add(class3);
	   classSet2.add(class1);
	   classSet2.add(class2);

	   //Create Class Set3
	   Set<Class> classSet3 = new HashSet();
	   classSet3.add(class2);
	   classSet3.add(class3);
	   classSet3.add(class1);

	   //Create Teacher Entity
	   Teacher teacher1 = new Teacher(0, "Satish","Java",classSet1);
	   Teacher teacher2 = new Teacher(0, "Krishna","Adv Java",classSet2);
	   Teacher teacher3 = new Teacher(0, "Masthanvali","DB2",classSet3);

	   //Store Teacher
	   entitymanager.persist(teacher1);
	   entitymanager.persist(teacher2);
	   entitymanager.persist(teacher3);


	   entitymanager.getTransaction( ).commit( );
	   entitymanager.close( );
	   emfactory.close( );
	   }

}
