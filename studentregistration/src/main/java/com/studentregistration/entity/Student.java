package com.studentregistration.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="d_studentregistration_mst")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="serial_No")
	private Integer serialNo;
	
	@Column(name="student_Id")
	private Long studentId;
	
	@Column(name="student_Name")
	private String studentName;
	
	@Column(name="father_Name")
	private String fatherName;
	
	@Column(name="mother_Name")
	private String motherName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="caste")
	private String caste;
	
	@Column(name="religion")
	private String religion;
	
	@Column(name="address")
	private String address;
	
	@Column(name="qualification1")
	private String qualification1;
	
	@Column(name="qualification2")
	private String qualification2;
	
	@Column(name="qualification3")
	private String qualification3;
	
	
	public Student() {
		super();
	}

	public Student(Integer serialNo, Long studentId, String studentName, String fatherName, String motherName,
			String gender, String caste, String religion, String address, String qualification1, String qualification2,
			String qualification3) {
		super();
		this.serialNo = serialNo;
		this.studentId = studentId;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.caste = caste;
		this.religion = religion;
		this.address = address;
		this.qualification1 = qualification1;
		this.qualification2 = qualification2;
		this.qualification3 = qualification3;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}


	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQualification1() {
		return qualification1;
	}

	public void setQualification1(String qualification1) {
		this.qualification1 = qualification1;
	}


	public String getQualification2() {
		return qualification2;
	}

	public void setQualification2(String qualification2) {
		this.qualification2 = qualification2;
	}

	public String getQualification3() {
		return qualification3;
	}

	public void setQualification3(String qualification3) {
		this.qualification3 = qualification3;
	}

		
}
