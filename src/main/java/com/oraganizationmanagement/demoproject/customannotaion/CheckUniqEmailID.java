package com.oraganizationmanagement.demoproject.customannotaion;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.oraganizationmanagement.demoproject.model.Student;
import com.oraganizationmanagement.demoproject.repository.StudentRepository;

public class CheckUniqEmailID implements ConstraintValidator<CheckUniqeEmail, String> {

	StudentRepository studentRepository;
	
	 public CheckUniqEmailID(StudentRepository studentRepository) {
	        this.studentRepository = studentRepository;
	    }

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		
		System.out.println("in Validation");

		List<Student> listofStudents = studentRepository.findByEmail(email);
		if(listofStudents.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

}
