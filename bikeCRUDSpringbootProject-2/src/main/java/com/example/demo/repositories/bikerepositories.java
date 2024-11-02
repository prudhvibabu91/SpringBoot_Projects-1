package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.bike;

public interface bikerepositories extends JpaRepository<bike, String>{

}
