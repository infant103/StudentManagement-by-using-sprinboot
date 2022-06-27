package com.studentmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmanagement.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{

	Optional<UserEntity> findByUserName(String username);




	
	
}
