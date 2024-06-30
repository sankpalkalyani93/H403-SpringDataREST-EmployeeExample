package com.example.EmployeeDatabaseWithDataREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeDatabaseWithDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDatabaseWithDataRestApplication.class, args);
	}

}
