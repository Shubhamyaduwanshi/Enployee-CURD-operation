package com.csipl.emp.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csipl.emp.model.Employee;
import com.csipl.emp.service.EmployeeService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	static Logger logger = Logger.getLogger(EmployeeController.class.getName());

	@Autowired
	private EmployeeService employeeService;

	// get request
	@RequestMapping(value = "/employees/view", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployee();
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public Employee getPlayerById(@PathVariable int id) {
		return employeeService.getPlayer(id);
	}

	// post request
	@RequestMapping(value = "/employees/save", method = RequestMethod.POST)
	public void savePlayer(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}

	//
	@RequestMapping(value = "/employees/update", method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}

	@RequestMapping("/employees/partialUpdate/{id}")
	public void updateResource(@RequestBody Employee employee, @PathVariable("id") String id) {
		employeeService.updateCustomer(employee, id);

	}

	@RequestMapping(value = "employees/delete/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
	
	@RequestMapping("/employee/dataUpdate")
	public void attempUpdate() {
		employeeService.attempUpdate();
	}


}
