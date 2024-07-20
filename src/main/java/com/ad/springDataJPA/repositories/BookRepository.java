package com.ad.springDataJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ad.springDataJPA.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String>  {
}