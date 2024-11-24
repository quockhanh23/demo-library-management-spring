package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.common.MemberStatus;
import com.example.demo_library_management.models.Member;
import com.example.demo_library_management.repository.MemberRepository;
import com.example.demo_library_management.service.AdminService;
import com.example.demo_library_management.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final MemberService memberService;

    private final MemberRepository memberRepository;

    public void upDateStatusMember(Long idMember, MemberStatus status) {
        Member member = memberService.findById(idMember);
        member.setStatus(status);
        member.setUpdatedAt(new Date());
        memberRepository.save(member);
    }
}
