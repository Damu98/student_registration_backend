package com.studentregistration.serviceimpl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.studentregistration.entity.Student;
import com.studentregistration.repository.StudentRepository;
import com.studentregistration.service.StudentService;



@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public ResponseEntity<?> addStudent(Student student) {
		Map<String, Object> response= new LinkedHashMap<String, Object>();
		
		try {
			 studentRepository.save(student);
			System.out.println("id::"+student.getStudentId());
			 
			
			if(response.size()>0) {
				response.put("student", student);
				response.put("scode", 1);
				response.put("sdec", "user added");
				
			}
			
			else {
				response.put("scode", 2);
				response.put("sdec", "not added");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.put("scode", 4);
			response.put("error", "error occured while adding student ");
			
		}
		return ResponseEntity.ok(response);
	}

	@Override
	public ResponseEntity<?>getStudents() {
		
	Map<String, Object> response= new LinkedHashMap<String, Object>();
		
		try {
			
			//List<Map<String,Object>>data=studentRepository.getdata();
//		}
//		return studentRepository.findAll();
			List<Student>data=studentRepository.findAll();
			
					//if(student.getFatherName().length() >0) {
					if(data.size()>0) {
						response.put("student", data);
						response.put("scode", 1);
						response.put("sdec", "user added");
						
					}
					
					else {
						response.put("scode", 2);
						response.put("sdec", "not added");
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					response.put("scode", 4);
					response.put("error", "error occured while adding student ");
					
				}
		
				return ResponseEntity.ok(response);
			}
	
	

}
