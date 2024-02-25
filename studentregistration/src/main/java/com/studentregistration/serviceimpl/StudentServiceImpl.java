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
        Map<String, Object> response = new LinkedHashMap<>();
        
        try {
           
            Long maxStudentId = studentRepository.findMaxStudentId();

            // Increment the maxStudentId by 1 to get the new studentId
            Long newStudentId = maxStudentId != null ? maxStudentId + 1 : 50000;

            // Set the new studentId to the student object
            student.setStudentId(newStudentId);

            // Call the repository method to insert the student
            studentRepository.insertStudent(student.getStudentId(), student.getStudentName(), student.getFatherName(),
                    student.getMotherName(), student.getGender(), student.getCaste(), student.getReligion(),
                    student.getAddress(), student.getQualification1(), student.getQualification2(),
                    student.getQualification3());

            // Log the serial number
            System.out.println("Serial No: " + student.getSerialNo());

            // Prepare response based on the status
            if (student.getStudentId() > 0) {
                response.put("student", student);
                response.put("scode", 1);
                response.put("sdec", "User added successfully");
            } else {
                response.put("scode", 2);
                response.put("sdec", "User not added");
            }
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
            response.put("scode", 4);
            response.put("error", "Error occurred while adding student");
        }
        
        // Return the ResponseEntity with the response map
        return ResponseEntity.ok(response);
    }	@Override
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
	
    @Override
    public ResponseEntity<?> deleteStudentById(Long studentId) {
        try {
            studentRepository.deleteByStudentId(studentId);
            return ResponseEntity.ok("Students with student ID " + studentId + " deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error occurred while deleting students with student ID " + studentId);
        }
    }
}
