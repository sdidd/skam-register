package com.register.java.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userInterface extends JpaRepository<user, Integer> 
{
	user findByUsername(String username);
}
