package com.csipl.emp.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.csipl.emp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
    
	/*
	 * @Modifying
	* @Query(value ="UPDATE employee e SET e.max_attempt=0 where e.max_attempt!=0" ,nativeQuery=true)
	*/
	@Modifying
	 @Query("UPDATE e employee e SET e.max_attempt=0 WHERE e.max_attempt>0")
	 void updateAttempt();

}
