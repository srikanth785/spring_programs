package com.cat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
	User findByUsername(String username);
}
