package running;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Emp_copy;


public class JPA03CRUD {
	
	public static void searchOne(int empno) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("encore");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Emp_copy entity = em.find(Emp_copy.class, empno);
		System.out.println(entity);
		
		tx.commit();

		em.close();
		factory.close();
	}
	
//	public static void update() {
//		// factory 생성
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("encore");
//				
//		// manager 생성
//		EntityManager em = factory.createEntityManager();		
//		
//		// tx 생성
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		
//		Emp_copy entity = em.find(Emp_copy.class, 8000);
//
//		entity.setEname("MARIO");
//		
//		// em.persist(entity);
//		tx.commit();
//		
//		//자원반환
//		em.close();
//		factory.close();
//	}

//			public static void remove() {
//				 
//				EntityManagerFactory factory = Persistence.createEntityManagerFactory("encore");			 
//				EntityManager em = factory.createEntityManager();						 
//				EntityTransaction tx = em.getTransaction();
//				tx.begin();
//				
//			 
//				Emp_copy entity = em.find(Emp_copy.class, 8000);  
//				//entity.setName("MARIO");
//				em.remove(entity);
//			 
//				tx.commit();
//			 
//				em.close();
//				factory.close();
//			}
//			


			public static void main(String[] args) {
 				searchOne(8000);
//				update();			
//				remove();
 				
			}
			
		}
