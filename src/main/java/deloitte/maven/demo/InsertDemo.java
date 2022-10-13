package deloitte.maven.demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//CRUD Ops 

//SELECT - find();
//INSERT - persist();
//UPDATE - merge();
//DELETE - remove();
 
public class InsertDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter details to add a newe employee:");

		System.out.println("Enter eid:");
		int eid = sc.nextInt();
		System.out.println("Enter firstName:");
		String firstName = sc.next();
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();

		Employee empToInsert = new Employee(eid, firstName, salary);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("abc");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(empToInsert);
		Employee empFound = manager.find(Employee.class, eid);
		System.out.println(empFound.toString());
		System.out.println("Employee added successfully.");
		manager.getTransaction().commit();

		manager.close();
		factory.close();
		sc.close();

		System.out.println("End");

	}

}
