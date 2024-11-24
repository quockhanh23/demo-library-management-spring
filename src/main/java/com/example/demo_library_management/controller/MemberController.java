package com.example.demo_library_management.controller;

import com.example.demo_library_management.dto.MemberDTO;
import com.example.demo_library_management.models.Member;
import com.example.demo_library_management.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/get-one")
    public ResponseEntity<?> getDetailMember(Long memberId) {
        Member member = memberService.findById(memberId);
        MemberDTO memberDTO = new MemberDTO();
        BeanUtils.copyProperties(member, memberDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add-new-member")
    public ResponseEntity<?> addNewMember(@RequestBody Member member) {
        memberService.createMember(member);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update-member")
    public ResponseEntity<?> updateMember(Long idMember, Member member) {
        Member updateMember = memberService.updateMember(idMember, member);
        return new ResponseEntity<>(updateMember, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteMembers(Long idMember) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
