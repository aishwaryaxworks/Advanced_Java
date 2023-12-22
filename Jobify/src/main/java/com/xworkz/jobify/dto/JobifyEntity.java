package com.xworkz.jobify.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//import com.xworkz.jobify.enumerator.AccountType;

import lombok.Data;

@Data
@Entity
@Table(name = "Register")
@NamedQuery(name = "findByEmail", query = "select entity from JobifyEntity entity where entity.email=:email")
public class JobifyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String mobile;
	private String password;
	private String account;
	private String createdBy;
	private LocalDate createdOn;
	

}