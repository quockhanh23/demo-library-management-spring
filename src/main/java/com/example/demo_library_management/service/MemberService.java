package com.example.demo_library_management.service;

import com.example.demo_library_management.models.Member;

public interface MemberService {

    void createMember(Member member);

    Member findById(Long idMember);
}
