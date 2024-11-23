package com.example.demo_library_management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String status;
    private Date createdAt;
    private Date updatedAt;
}
