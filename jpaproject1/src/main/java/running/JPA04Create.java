package running;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Emp_copy;


public class JPA04Create {
 

		public static void main(String[] args) {
			// factory 생성
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("encore");
					
			// manager 생성
			EntityManager em = factory.createEntityManager();		
			
			// tx 생성
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			
			// entity 생성
			Emp_copy entity = new Emp_copy();
		 
			
			entity.setEname("MARIA");
			entity.setEmpno(8000);
			entity.setJob("salesman");
			entity.setMgr(7822);
			entity.setHiredate(83/05/02);
			entity.setSal(1000);
			entity.setComm(400);
			entity.setDeptno(10);

			// db에 저장(실제 db에 table 생성), 단, 데이터 저장은 불가 상태
			em.persist(entity);
			
			// 영구저장(반영) or rollback
			tx.commit();
	}

}
