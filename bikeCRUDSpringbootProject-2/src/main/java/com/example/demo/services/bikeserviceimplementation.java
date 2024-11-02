package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.bike;
import com.example.demo.repositories.bikerepositories;
@Service
public class bikeserviceimplementation implements bikeservice{
	bikerepositories bikerepo;
	

	public bikeserviceimplementation(bikerepositories bikerepo) {
		super();
		this.bikerepo = bikerepo;
	}

	@Override
	public String createbike(bike b) {
		bikerepo.save(b);
		return "object is created and saved";
	}

	@Override
	public List<bike> fetchbike() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(bike b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String sno) {
		// TODO Auto-generated method stub
		return null;
	}

}
