package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee emp1=new Employee();
		emp1.setEmpname("Rasika Waghchoure");
		
		Employee emp2=new Employee();
		emp2.setEmpname("gauri kandekar");
		
		Address a1=new Address();
		a1.setPincode(422003);
		a1.setArea("hirawadi");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		
		Address a2=new Address();
		a2.setPincode(422005);
		a2.setArea("panchavity");
		a2.setCity("Nashik");
		a2.setState("Maharashtra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a2);
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();
		System.out.println("Data added succesfully");
		em.close();
		factory.close();
		
		
	}

}
