package com.project.blog.domain;

import org.springframework.web.bind.annotation.GetMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`user`")
public class User {

    @Id @GeneratedValue
    private Long userId;

    private String name;

}
