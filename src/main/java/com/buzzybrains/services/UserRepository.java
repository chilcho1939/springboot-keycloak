package com.buzzybrains.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buzzybrains.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
