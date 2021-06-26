package com.oraganizationmanagement.demoproject.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.oraganizationmanagement.demoproject.customannotaion.CheckUniqeEmail;

@Entity
@Table(name = "TBL_STUDENT")
@EntityListeners(AuditingEntityListener.class)
public class Student extends Auditable<String>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "STUDENT_SEQUENCE")
	@SequenceGenerator(name = "STUDENT_SEQUENCE", initialValue = 1, allocationSize = 1, sequenceName = "STUDENT_SEQUENCE")
	private int studentId;
	private String firstName;
	private String lastName;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Address address;
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Subject> subjects;
	@CheckUniqeEmail(message = "This email Id Is Alerdy in use")
	private String email;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", students=" + subjects + "]";
	}

}
