package com.xworkz.chocolate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

//@Entity
//@Table(name = "chocolate")
//@NamedQuery(name = "findByName", query = "select dto from ChocolateDTO dto where dto.name=:nm")
//@NamedQuery(name = "updateQuantity" , query = "Update ChocolateDTO dto set dto.quantity=:quantity where dto.name=:nm")
//@NamedQuery(name = "deleteByName", query = "DELETE FROM ChocolateDTO dto WHERE dto.name=:name")
public class ChocolateDTO{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
	private String name;
	private int price;
	private int quantity;
	private String manufacturer;
	private String password;
	private String confirmPassword;
}
