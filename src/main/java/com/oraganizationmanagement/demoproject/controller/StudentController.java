package com.oraganizationmanagement.demoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oraganizationmanagement.demoproject.model.Student;
import com.oraganizationmanagement.demoproject.service.StudentServiceImpl;



@RestController
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentserviceimpl;

	
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudet(@RequestBody Student student)
	{
		Student stuent=studentserviceimpl.saveStudent(student);
		return new ResponseEntity<>(stuent,HttpStatus.OK);
	}

}
