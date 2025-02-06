package com.cat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.model.Passenger;

public interface ITouristRepo extends JpaRepository<Passenger, Integer>
{

}
