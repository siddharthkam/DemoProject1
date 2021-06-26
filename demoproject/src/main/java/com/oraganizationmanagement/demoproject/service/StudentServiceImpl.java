package com.oraganizationmanagement.demoproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraganizationmanagement.demoproject.model.Student;
import com.oraganizationmanagement.demoproject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentrepo;

	@Override
	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public Student getStudent(int id) throws Exception {

		return studentrepo.getById(id);
	}

	@Override
	public List<Student> getStudentList() {
		return studentrepo.findAll();
	}

	@Override
	public List<Student> getStudentByEMAILList(String email) {
      return studentrepo.findByEmail(email);
	}


}
