package trail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestRemove {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishnu");
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entitymanager.getTransaction();
		car c=entitymanager.find(car.class, 1);
		entityTransaction.begin();
		entitymanager.remove(c);
		entityTransaction.commit();
	}

}
