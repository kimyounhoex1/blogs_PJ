package com.project.blog.domain.auth.dto;

import lombok.Getter;

@Getter
public class LoginRequest {
    private String loginId;
    private String loginPassword;
    
}
