package com.studentregistration.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentregistration.entity.Student;
import com.studentregistration.service.StudentService;

@Controller
@CrossOrigin
@RequestMapping("/students")
public class StudentController {

	
	@Autowired
	private StudentService studentService; 
	
	@PostMapping("/addStudent")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		
		System.out.println("New inserted values :"+student.toString());
		return studentService.addStudent(student);
	}
	
	@GetMapping("/getStudents")
	public ResponseEntity<?> getAllStudents(){
		
		return studentService.getStudents();
	}
	
	@DeleteMapping("/{studentId}")
    public ResponseEntity<?> deleteStudentById(@PathVariable Long studentId) {
        ResponseEntity<?> response;
        try {
            response = studentService.deleteStudentById(studentId);
        } catch (Exception e) {
            e.printStackTrace();
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred while processing the request.");
        }
        return response;
    }
	
}
