package com.example.demo_library_management.controller;

import com.example.demo_library_management.models.Member;
import com.example.demo_library_management.service.AdminService;
import com.example.demo_library_management.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/admins")
@RequiredArgsConstructor
public class AdminController {

    private final MemberService memberService;
    private final AdminService adminService;

    @GetMapping("/get-all-members")
    public ResponseEntity<?> getAllMembers(@RequestParam(defaultValue = "0", required = false) int page,
                                           @RequestParam(defaultValue = "10", required = false) int size) {
        Sort sort = Sort.by("createdAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<Member> members = memberService.findAll(pageable);
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

    @GetMapping("/change-status")
    public ResponseEntity<?> changeStatusMember(Long idMember, String status) {
        adminService.upDateStatusMember(idMember, status);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
