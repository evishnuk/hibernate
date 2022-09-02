package trail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		car c=new car();
		c.setId(1);
		c.setBrand("ferrari");
		c.setColor("blue");
		c.setPrice("3000000");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishnu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(c);
		entityTransaction.commit();
		
	}

}
