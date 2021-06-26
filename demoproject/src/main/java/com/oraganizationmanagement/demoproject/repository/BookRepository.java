package com.oraganizationmanagement.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oraganizationmanagement.demoproject.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
