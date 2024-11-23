package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.models.Category;
import com.example.demo_library_management.repository.CategoryRepository;
import com.example.demo_library_management.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public void createCategory(Category category) {

    }
}
