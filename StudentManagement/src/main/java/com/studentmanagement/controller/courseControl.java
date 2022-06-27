package com.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentmanagement.entity.CourseEntity;
import com.studentmanagement.service.CourseService;

@Controller
public class courseControl {

	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/getCourse")
	public String findAll(Model model) {
		model.addAttribute("courseList",courseService.findAll());
		return "CourseDetails";
	}
	@GetMapping("/addCourse")
	public String addNewCourse(Model model) {
		CourseEntity course= new CourseEntity();
		model.addAttribute("saveCourse", course);
		return "AddCourse";
	}
	
	@PostMapping("/saveCourse")
	public String saveCourse(CourseEntity course) {
		courseService.saveCourse(course);
		return  "redirect:/getCourse";
		
	}
	@GetMapping("/showUpdate/{id}")
	public String showUpdate(@PathVariable("id") Integer id,Model model ) {
		CourseEntity courseList=courseService.findById(id);
		model.addAttribute("course", courseList);
		return "updateCourse";
	}
	@GetMapping("/deleteCourse/{id}")
	public String deleteCourse(@PathVariable("id")Integer id) {
		courseService.deleteById(id);
	return"redirect:/getCourse";	
	}
	
	
}
