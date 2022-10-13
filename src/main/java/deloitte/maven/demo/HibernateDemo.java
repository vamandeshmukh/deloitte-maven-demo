package deloitte.maven.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//CRUD Ops 

//SELECT - find();
//INSERT - persist();
//UPDATE - merge();
//DELETE - remove();

public class HibernateDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("abc");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Employee emp = manager.find(Employee.class, 101); // SELECT * FROM emp2 WHERE eid = 101;

		System.out.println(emp.toString());

		manager.getTransaction().commit();

		manager.close();
		factory.close();

		System.out.println("End");

	}

}
