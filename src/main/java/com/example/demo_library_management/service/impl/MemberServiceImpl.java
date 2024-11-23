package com.example.demo_library_management.service.impl;

import com.example.demo_library_management.dto.MemberDTO;
import com.example.demo_library_management.models.Member;
import com.example.demo_library_management.repository.MemberRepository;
import com.example.demo_library_management.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
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
    public Member findById(Long idMember) {
        Optional<Member> memberOptional = memberRepository.findById(idMember);
        if (memberOptional.isEmpty()) {
            throw new RuntimeException("Không tìm thấy người dùng có id là: " + idMember);
        }
        return memberOptional.get();
    }
}
