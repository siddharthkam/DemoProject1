package com.oraganizationmanagement.demoproject.service;

import java.util.List;

import com.oraganizationmanagement.demoproject.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student getStudent(int id) throws Exception;
	public List<Student> getStudentList();
	public List<Student> getStudentByEMAILList(String email);
	

}
