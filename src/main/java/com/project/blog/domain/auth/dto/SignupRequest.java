package com.project.blog.domain.auth.dto;

import lombok.Getter;

@Getter
public class SignupRequest {
    private String loginId;
    private String password;
}
