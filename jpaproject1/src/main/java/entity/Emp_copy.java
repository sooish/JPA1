package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Emp_copy {

	@Id
	private int empno;
	@Column(length=20)
	private String ename;
	@Column(length=20)
	private String job;
	@Column(length=20)
	private int mgr;
	@Column(length=20)
	private int hiredate;
	@Column(length=20)
	private int sal;
	@Column(length=20)
	private int comm;
	@Column(length=20)
	private int deptno;
	

}

 
 