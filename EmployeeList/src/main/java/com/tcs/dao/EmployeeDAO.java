package com.tcs.dao;
import java.util.*;
import com.tcs.model.*;
public interface EmployeeDAO {

	public void createEmployee(Employee employee);
    
    public Employee getEmployeeById(int id);
    public List<Employee> getAllemployees();
    
    public void updateEmployee(Employee employee);
    
    public void deleteEmployeet(int id);

}
