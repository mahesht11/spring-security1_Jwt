package com.security.jwt.service;

import com.security.jwt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDetailsService userDetailsService();
}
