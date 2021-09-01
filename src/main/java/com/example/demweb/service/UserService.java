package com.example.demweb.service;

import com.example.demweb.model.User;
import com.example.demweb.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@RequiredArgsConstructor
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUserAll() {
        return userRepository.findAll();
    }
}
