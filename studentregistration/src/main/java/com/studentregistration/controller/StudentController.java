package com.studentregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentregistration.entity.Student;
import com.studentregistration.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	
	@Autowired
	private StudentService studentService; 
	
	@PostMapping("/addStudent")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		
		return studentService.addStudent(student);
	}
	
	@GetMapping("/getStudents")
	public ResponseEntity<?> getAllStudents(){
		
		return studentService.getStudents();
	}
	
}
