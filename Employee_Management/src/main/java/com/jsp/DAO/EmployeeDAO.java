package com.jsp.DAO;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.DTO.Employee;

@Repository
public class EmployeeDAO {
	@Autowired
	EntityManager manager;
	@Autowired
	EntityTransaction transaction;
	
	// inserting employee object
	public void saveEmployee(Employee employee)
	{
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
	
	// retrieving object by id
	public Employee getEmployeeById(int id)
	{
	Employee e=	manager.find(Employee.class, id);
		return e;
		
	}
	
	//deleting employee object
	public void deleteEmployee(int id)
	{
		Employee e=	manager.find(Employee.class, id);
		if(e!=null)
		{
			transaction.begin();
			manager.remove(e);
			transaction.commit();
		}
	}
	
	//updating employee object
	public void updateEmployee(Employee updateEmployee)
	{
		transaction.begin();
		manager.merge(updateEmployee);
		transaction.commit();
	}
	
	//displaying all employee objects
	public List<Employee> getAllEmployees()
	{
	Query q=manager.createQuery("select e from Employee e");
	List<Employee> employee=q.getResultList();
	return employee;
	}
	
}
