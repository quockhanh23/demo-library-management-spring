package com.example.demo_library_management.controller;

import com.example.demo_library_management.models.Member;
import com.example.demo_library_management.repository.MemberRepository;
import com.example.demo_library_management.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/admins")
@RequiredArgsConstructor
public class AdminController {

    private final MemberRepository memberRepository;

    private final AdminService adminService;

    @GetMapping("/get-all-members")
    public ResponseEntity<?> getAllMembers() {
        List<Member> memberList = memberRepository.findAll();
        return new ResponseEntity<>(memberList, HttpStatus.OK);
    }

    @GetMapping("/change-staus")
    public ResponseEntity<?> changeStatusMember(Long idMember, String status) {
        adminService.upDateStatusMember(idMember, status);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
