package com.example.demo_library_management.repository;

import com.example.demo_library_management.models.Evaluate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluateRepository extends JpaRepository<Evaluate, Long> {
}
