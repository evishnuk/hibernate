package trail;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestAll {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vishnu");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select c from car c");
		List<car>list=q.getResultList();
		for(car c:list) {
			System.out.println(c.getId());
			System.out.println(c.getBrand());
			System.out.println(c.getColor());
			System.out.println(c.getPrice());
		}

	}

}
