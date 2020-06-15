package com.oppo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.oppo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}