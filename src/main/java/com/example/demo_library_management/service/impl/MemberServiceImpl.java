package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.models.Member;
import com.example.demo_library_management.repository.MemberRepository;
import com.example.demo_library_management.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void createMember(Member member) {
        member.setCreatedAt(new Date());
        memberRepository.save(member);
    }

    @Override
    public Member updateMember(Long idMember, Member member) {
        Member oldMember = findById(idMember);
        return oldMember;
    }

    @Override
    public Member findById(Long idMember) {
        Optional<Member> memberOptional = memberRepository.findById(idMember);
        if (memberOptional.isEmpty()) {
            throw new RuntimeException("Không tìm thấy người dùng có id là: " + idMember);
        }
        return memberOptional.get();
    }

    @Override
    public Page<Member> findAll(Pageable pageable) {
        return memberRepository.findAll(pageable);
    }
}
