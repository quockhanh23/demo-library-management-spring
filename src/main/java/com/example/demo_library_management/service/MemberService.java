package com.example.demo_library_management.service;

import com.example.demo_library_management.models.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MemberService {

    void createMember(Member member);

    Member updateMember(Long idMember, Member member);

    Member findById(Long idMember);

    Page<Member> findAll(Pageable pageable);
}
