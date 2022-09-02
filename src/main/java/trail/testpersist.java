package trail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class testpersist {
	public static void main(String[] args) {
     car car=new car();
     car.setId(1);
     car.setBrand("Ford");
     car.setColor("black");
     car.setPrice("75000000");
     
     car.setId(2);
     car.setBrand("audi");
     car.setColor("black");
     car.setPrice("15000000");
     
     car.setId(3);
     car.setBrand("lambargini");
     car.setColor("orange");
     car.setPrice("200000000");
     
     car.setId(4);
     car.setBrand("rolls roys");
     car.setColor("white");
     car.setPrice("15000000");
     
     car.setId(5);
     car.setBrand("ducati");
     car.setColor("black");
     car.setPrice("15000000");
     
     
     EntityManagerFactory emf=Persistence.createEntityManagerFactory("vishnu");
     EntityManager em=emf.createEntityManager();
     EntityTransaction et=em.getTransaction();
     et.begin();
     em.persist(car);
     et.commit();
}
}
