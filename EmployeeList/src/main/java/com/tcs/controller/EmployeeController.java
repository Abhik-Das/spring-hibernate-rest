package com.tcs.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dao.*;
import com.tcs.model.*;
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDAOImpl employeedaoimpl;
	/*** Creating a new Employee ***/
    @RequestMapping(value="/create", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createEmployee(@RequestBody Employee student)
    {
    	employeedaoimpl.createEmployee(student);
    }
    
    /*** Retrieve a single Employee ***/
    @RequestMapping(value="/employee/{id}",produces="application/json",
            method=RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") int id)
    {
        Employee employee = employeedaoimpl.getEmployeeById(id);
        return employee;
    }
    
    /*** Retrieve all Employees ***/
    @RequestMapping(value="/employees",produces="application/json",
            method=RequestMethod.GET)
    public List getAllEmployees()
    {
        List employeeList = employeedaoimpl.getAllemployees();
        return employeeList;
    }
    
    /*** Update a Employee ***/
    @RequestMapping(value="/update", method=RequestMethod.PUT, 
            produces="application/json", consumes="application/json")
    public void updateEmployee(@RequestBody Employee employee)
    {
    	employeedaoimpl.updateEmployee(employee);
    }
    
    /*** Delete a Employee ***/
    @RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE,
             produces="application/json")
    public void deleteEmployee(@PathVariable("id") int id)
    {
    	employeedaoimpl.deleteEmployeet(id);
    }
}
