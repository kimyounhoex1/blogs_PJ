package com.project.blog.domain.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

// UserEntity
@Entity
@Getter
@Table(name = "`user`")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String loginId;

    @Column(nullable = false)
    private String loginPassword;

    protected User() {}

    public User(String loginId, String loginPassword) {
        this.loginId = loginId;
        this.loginPassword = loginPassword; 
    }
}
