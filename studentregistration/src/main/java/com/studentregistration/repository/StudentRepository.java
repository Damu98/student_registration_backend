package com.studentregistration.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentregistration.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	
	@Query(nativeQuery=true,value="select * from d_studentregistration_mst ")
	List<Map<String,Object>> getdata();
}
