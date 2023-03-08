package com.example.demo.main;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String LaptopName;
	private String Color;
	private int Price;
	public Laptop(int id, String laptopName, String color, int price) {
		super();
		this.id = id;
		LaptopName = laptopName;
		Color = color;
		Price = price;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLaptopName() {
		return LaptopName;
	}
	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}

}