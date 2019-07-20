package com.tcs.dao;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.tcs.model.*;

@Service
@Transactional(propagation = Propagation.REQUIRED) 
public class EmployeeDAOImpl implements EmployeeDAO  {

	   @PersistenceContext
	    private EntityManager entityManager;
	
	@Override
	public void createEmployee(Employee employee) {
		entityManager.persist(employee);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		return entityManager.find(Employee.class,id);
	}

	@Override
	public List<Employee> getAllemployees() {
		return entityManager.createQuery("select emp from Employee emp").getResultList();
	}

	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);
		
	}

	@Override
	public void deleteEmployeet(int id) {
		 Employee emp = entityManager.find(Employee.class,id);
	        entityManager.remove(emp);
		
	}

}
