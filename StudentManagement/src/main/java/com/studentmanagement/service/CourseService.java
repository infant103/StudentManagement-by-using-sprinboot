package com.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.entity.CourseEntity;
import com.studentmanagement.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<CourseEntity> findAll() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	public CourseEntity saveCourse(CourseEntity course) {
		// TODO Auto-generated method stub
		return  courseRepository.save(course);
	}

	public CourseEntity findById(Integer id) {
		// TODO Auto-generated method stub
		return courseRepository.findById(id).orElseThrow();
	}

	public void deleteById(Integer id) {
		 courseRepository.deleteById(id);
		
	}
	
	
	
	
}
