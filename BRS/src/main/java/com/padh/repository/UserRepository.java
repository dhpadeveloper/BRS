package com.padh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.padh.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
