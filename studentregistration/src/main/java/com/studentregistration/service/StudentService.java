package com.studentregistration.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.studentregistration.entity.Student;

@Service
public interface StudentService {

	public ResponseEntity<?> addStudent(Student student);
	
	public ResponseEntity<?> getStudents();

	public ResponseEntity<?> deleteStudentById(Long studentId);
}
