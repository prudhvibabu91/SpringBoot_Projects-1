package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.bike;

public interface bikeservice {
	public String createbike(bike b);
	public List<bike> fetchbike();
	public String update(bike b);
	public String delete(String sno);

}
