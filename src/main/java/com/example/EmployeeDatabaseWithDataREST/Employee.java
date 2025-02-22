package com.example.EmployeeDatabaseWithDataREST;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "employee")
@EntityListeners(AuditingEntityListener.class)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	
	@Column(name = "empname")
	@OrderBy("ASC")
	private String empname;
	
	@Column(name = "empsalary")
	private float empsalary;
	
	@Column(name = "empcompany")
	private String empcompany;
	
	
	@CreatedDate
	@Column(name = "createdAt", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@LastModifiedDate
	@Column(name = "lastModifiedAt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedAt;
	
	
	public Employee() {}
	
	public Employee(int empid, String empname, float empsalary, String empcompany) {
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empcompany = empcompany;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpcompany() {
		return empcompany;
	}
	public void setEmpcompmany(String empcompmany) {
		this.empcompany = empcompmany;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public void setEmpcompany(String empcompany) {
		this.empcompany = empcompany;
	}
	
	
}
