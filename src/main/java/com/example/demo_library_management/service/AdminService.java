package com.example.demo_library_management.service;

import com.example.demo_library_management.common.MemberStatus;

public interface AdminService {

   void upDateStatusMember(Long idMember, MemberStatus status);
}
