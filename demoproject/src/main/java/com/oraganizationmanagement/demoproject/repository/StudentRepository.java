package com.oraganizationmanagement.demoproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oraganizationmanagement.demoproject.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	public List<Student> findByEmail(String name);
}
