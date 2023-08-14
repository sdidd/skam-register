<<<<<<< HEAD
package com.register.java.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userInterface extends JpaRepository<user, Integer> 
{
	user findByUsername(String username);
}
=======
package com.register.java.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userInterface extends JpaRepository<user, Integer> 
{
	user findByUsername(String username);
}
>>>>>>> 9c44f83aee58a9f326251ab658f3881104f1654e
