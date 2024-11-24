package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.models.PageBook;
import com.example.demo_library_management.repository.PageBookRepository;
import com.example.demo_library_management.service.PageBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PageBookServiceImpl implements PageBookService {

    private final PageBookRepository pageBookRepository;

    @Override
    public void createPageBook(PageBook pageBook) {
        pageBookRepository.save(pageBook);
    }

    @Override
    public void createPageBooks(List<PageBook> pageBookList) {
        pageBookRepository.saveAll(pageBookList);
    }

    @Override
    public Page<PageBook> findAllPageBookByIdBook(Long idBook, Pageable pageable) {
        Page<PageBook> pageBooks = pageBookRepository.findAllPageBookByIdBook(idBook, pageable);
        return pageBooks;
    }
}
