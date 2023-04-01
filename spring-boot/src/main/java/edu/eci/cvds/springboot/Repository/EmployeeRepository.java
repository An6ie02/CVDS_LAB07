package edu.eci.cvds.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.eci.cvds.springboot.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
