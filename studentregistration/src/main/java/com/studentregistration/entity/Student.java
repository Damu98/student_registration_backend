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
	@Column(name="studentId")
	private Integer studentId;
	
	@Column(name="studentname")
	private String studentName;
	
	@Column(name="fathername")
	private String fatherName;
	
	@Column(name="mothername")
	private String motherName;
	
	@Column(name="gender")
	private char gender;
	
	@Column(name="caste")
	private String caste;
	
	@Column(name="religion")
	private String religion;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="serialno")
	private int serialNo;

	public Student() {
	}

	public Student(Integer studentId, String studentName, String fatherName, String motherName, char gender,
			String caste, String religion, String qualification, int serialNo) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.caste=caste;
		this.religion = religion;
		this.qualification = qualification;
		this.serialNo = serialNo;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

		
}
