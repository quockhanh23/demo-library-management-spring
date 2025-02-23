package com.example.demo_library_management.service;

import com.example.demo_library_management.models.PageBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PageBookService {

    void createPageBook(PageBook pageBook);

    void createPageBooks(List<PageBook> pageBookList);

    Page<PageBook> findAllPageBookByIdBook(Long idBook, Pageable pageable);

    PageBook findById(Long idPageBook);
}
