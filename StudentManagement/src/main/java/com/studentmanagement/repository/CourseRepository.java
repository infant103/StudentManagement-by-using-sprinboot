package com.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagement.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {

	
}
