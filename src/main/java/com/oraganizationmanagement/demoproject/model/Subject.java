package com.oraganizationmanagement.demoproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SUBJECT_SEQUENCE")
	@SequenceGenerator(name = "SUBJECT_SEQUENCE",initialValue = 1,allocationSize = 1,sequenceName = "SUBJECT_SEQUENCE_ID")
	private int subjectId;
	@Column(name = "SUBJECT_NAME")
	private String subjectName;
	@Column(name ="SUBJECT_MARKS")
	private int marks;
	@ManyToOne
	@JoinColumn(name="studentId")
	@JsonBackReference
	private Student student;
	
	public Subject()
	{
		
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", marks=" + marks + "]";
	}
	

}
