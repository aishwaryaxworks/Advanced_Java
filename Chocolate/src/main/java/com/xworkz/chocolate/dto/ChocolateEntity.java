package com.xworkz.chocolate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "chocolate")
@NamedQuery(name = "findByName", query = "select entity from ChocolateEntity entity where entity.name=:nm")
@NamedQuery(name = "updateQuantity" , query = "Update ChocolateEntity entity set entity.quantity=:quantity where entity.name=:nm")
@NamedQuery(name = "deleteByName", query = "DELETE FROM ChocolateEntity entity WHERE entity.name=:name")
public class ChocolateEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private int price;
	private int quantity;
	private String manufacturer;
}
