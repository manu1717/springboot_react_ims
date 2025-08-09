package com.hndse251f.InventoryMgtSystem.security;

import com.hndse251f.InventoryMgtSystem.exceptions.NotFoundException;
import com.hndse251f.InventoryMgtSystem.models.User;
import com.hndse251f.InventoryMgtSystem.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username)
                .orElseThrow(() -> new NotFoundException("user Email Not Found"));
        return AuthUser.builder()
                .user(user)
                .build();
    }
}
