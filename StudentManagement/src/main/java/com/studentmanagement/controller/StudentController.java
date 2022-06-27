package com.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentmanagement.entity.CourseEntity;
import com.studentmanagement.entity.StudentEntity;
import com.studentmanagement.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/getStudent")
	public String getStudents(Model model) {
		model.addAttribute("studentList", studentService.findAll());
		return"StudentDetails";
	}
	@GetMapping("/studentRegistration")
	public String addStudent(Model model) {
		StudentEntity student= new StudentEntity();
		model.addAttribute("addStudent", student);
		return "StudentRegistration";
	}
	@PostMapping("/saveStudent")
	public String saveStudent(StudentEntity student) {
		studentService.saveStudent(student);
		return "redirect:/getStudent";
	}
	@GetMapping("/showUpdateStudent/{id}")
	public String showUpdate(@PathVariable("id") Integer id,Model model ) {
		StudentEntity studentList=studentService.findById(id);
		model.addAttribute("student", studentList);
		return "updateStudent";
	}
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id")Integer id) {
		studentService.deleteById(id);
	return"redirect:/getStudent";	
	}
	
}
