package com.springboot.contact.DAO;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springboot.contact.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

