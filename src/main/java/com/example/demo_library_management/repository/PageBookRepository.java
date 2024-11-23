package com.example.demo_library_management.repository;

import com.example.demo_library_management.models.PageBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageBookRepository extends JpaRepository<PageBook, Long> {
}
