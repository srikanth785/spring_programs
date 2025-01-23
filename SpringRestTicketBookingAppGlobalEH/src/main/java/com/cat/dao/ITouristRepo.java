package com.cat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cat.model.Tourist;

@Repository
public interface ITouristRepo extends JpaRepository<Tourist, Integer>
{

}
