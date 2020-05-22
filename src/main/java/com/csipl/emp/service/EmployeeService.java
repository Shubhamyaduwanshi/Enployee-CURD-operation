package com.csipl.emp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csipl.emp.model.Employee;
import com.csipl.emp.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

   //Get all employee list
	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employeeList::add);
		return employeeList;
	}

	// get employee by id
	public Employee getPlayer(int id) {
		Optional<Employee> optionalEployee = employeeRepository.findById(id);
		if (optionalEployee.isPresent()) {
			return optionalEployee.get();
		}
		return null;
	}

	// save employee
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

    //update employee
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);

	}
	
	public void updateCustomer(Employee updateEmp,String id) {
		Optional<Employee> findEmpById = employeeRepository.findById(Integer.valueOf(id));
		Employee employee = findEmpById.get();
		
        employee.setEmail(updateEmp.getEmail());
         employeeRepository.save(employee);
	}

	// delete employee
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

	public void attempUpdate() {
		
		employeeRepository.updateAttempt();
	}

}
