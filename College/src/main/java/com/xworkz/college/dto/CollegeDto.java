package com.xworkz.college.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity
@Table(name = "collegeinfo")
@NamedQuery(name = "readAll" , query = "select dto from CollegeDto dto")
public class CollegeDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	private Integer noOfStudents;
	private Integer noOfStaffs;
	
	
	public CollegeDto() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "CollegeDto [id=" + id + ", name=" + name + ", location=" + location + ", noOfStudents=" + noOfStudents
				+ ", noOfStaffs=" + noOfStaffs + "]";
	}
	
	public CollegeDto( String name, String location, Integer noOfStudents, Integer noOfStaffs) {
		super();
		this.name = name;
		this.location = location;
		this.noOfStudents = noOfStudents;
		this.noOfStaffs = noOfStaffs;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getLocation() {
		return location;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLocation(String location) {
		this.location = location;
	}


}
