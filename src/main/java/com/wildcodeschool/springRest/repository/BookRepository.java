package com.wildcodeschool.springRest.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.springRest.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    public List<Book> findByTitleContainingOrDescriptionContaining(String searchTerm, String searchTerm2);
   
}
