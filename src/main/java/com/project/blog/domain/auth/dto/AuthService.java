package com.project.blog.domain.auth.dto;

import com.project.blog.domain.user.User;
import com.project.blog.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    // 회원 가입
    public void signup(SignupRequest request) {
        if (userRepository.findByLoginId(request.getLoginId()).isPresent()) {
            throw new IllegalArgumentException("이미 존재하는 아이디");
        }

        // String encodedPassword = passwordEncoder.encode(request.getPassword());

        User user = new User(request.getLoginId(), request.getPassword());
        userRepository.save(user);
    }

    public void login(LoginRequest request) {
        User user = userRepository.findByLoginId(request.getLoginId()).
        orElseThrow(() -> new IllegalArgumentException("아이디 없음"));

        if(!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            new IllegalArgumentException("비밀번호 틀림");
        }
    }
    
}
