package com.mockJunit.crud.Pojo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Car
{
	
	 @Id
	 @GeneratedValue(strategy  = GenerationType.AUTO)
     private int id;
     
	 
     private String name;
     
     
     @Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return id == other.id && Objects.equals(name, other.name) && price == other.price;
	}


	private int price;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	public Car(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public Car() {
		super();
	}
     
     
}
