package com.gospodenko.springeshop.service;

import com.gospodenko.springeshop.domain.User;
import com.gospodenko.springeshop.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService { //Security
    boolean save(UserDTO userDTO);
    void save(User user);
    List<UserDTO> getAll();

    User findByName(String name);
    void updateProfile(UserDTO userDTO);
}
