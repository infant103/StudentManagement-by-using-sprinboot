package com.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.entity.CourseEntity;
import com.studentmanagement.entity.StudentEntity;
import com.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<StudentEntity> findAll() {
		return studentRepository.findAll();
		
	}

	public StudentEntity saveStudent(StudentEntity student) {
		return studentRepository.save(student);
		
	}

	public StudentEntity findById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).orElseThrow();
	}

	public void deleteById(Integer id) {
		studentRepository.deleteById(id);
		
	}

	
	
}
