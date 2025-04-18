package com.cat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.entity.Health;

public interface HealthRepository extends JpaRepository<Health, Integer> 
{

}
