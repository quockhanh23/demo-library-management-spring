package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.models.PageBook;
import com.example.demo_library_management.repository.PageBookRepository;
import com.example.demo_library_management.service.PageBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PageBookServiceImpl implements PageBookService {

    private final PageBookRepository pageBookRepository;

    @Override
    public void createPageBook(PageBook pageBook) {

    }
}
