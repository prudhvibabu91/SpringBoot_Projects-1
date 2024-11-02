package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class bike {
	@Id
	String sno;
	String brand;
	int cost;
	public bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bike(String sno, String brand, int cost) {
		super();
		this.sno = sno;
		this.brand = brand;
		this.cost = cost;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "bike [sno=" + sno + ", brand=" + brand + ", cost=" + cost + "]";
	}
	

}
