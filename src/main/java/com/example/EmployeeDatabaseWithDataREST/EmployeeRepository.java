package com.example.EmployeeDatabaseWithDataREST;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.stereotype.Repository;

//@Repository
@RepositoryRestResource(path = "employees", collectionResourceRel = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
