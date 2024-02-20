package com.studentregistration.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.studentregistration.entity.Student;

public interface StudentService {

	public ResponseEntity<?> addStudent(Student student);
	
	public ResponseEntity<?> getStudents();
}
