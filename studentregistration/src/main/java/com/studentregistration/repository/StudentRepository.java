package com.studentregistration.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.studentregistration.entity.Student;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student,Integer>{

	
	@Query(nativeQuery=true,value="select * from d_studentregistration_mst ")
	List<Map<String,Object>> getdata();

	@Query(nativeQuery=true, value="select max(student_Id) as student_Id from d_studentregistration_mst")
	Long findMaxStudentId();

//	@Modifying
//    @Query(value = "INSERT INTO d_studentregistration_mst (student_Id, student_Name, father_Name, "
//    		+ "mother_Name, gender, caste, religion, address, qualification1, qualification2, qualification3) " 
//    		+"VALUES (:studentId, :studentName, :fatherName, :motherName, :gender, :caste, :religion, "
//    		+ ":address, :qualification1, :qualification2, :qualification3)",
//                   nativeQuery = true)
//    void insertStudent(@Param("studentId") Long studentId, @Param("studentName") String studentName, @Param("fatherName") String fatherName, 
//                       @Param("motherName") String motherName, @Param("gender") String gender, @Param("caste") String caste, 
//                       @Param("religion") String religion, @Param("address") String address, @Param("qualification1") String qualification1, 
//                       @Param("qualification2") String qualification2, @Param("qualification3") String qualification3);
//
//	
	

	@Modifying
    @Query(nativeQuery = true, value = "DELETE FROM d_studentregistration_mst WHERE student_id = :studentId")
    void deleteByStudentId(@Param("studentId") Long studentId);
}



