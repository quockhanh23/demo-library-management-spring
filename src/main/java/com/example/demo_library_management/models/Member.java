package com.example.demo_library_management.models;

import com.example.demo_library_management.common.MemberStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String confirmPassword;
    private String email;
    private String phoneNumber;
    private MemberStatus status;
    private Date createdAt;
    private Date updatedAt;
    private String avatar;
}
