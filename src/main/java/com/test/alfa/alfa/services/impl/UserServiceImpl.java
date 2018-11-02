package com.test.alfa.alfa.services.impl;

import com.test.alfa.alfa.models.User;
import com.test.alfa.alfa.repositories.UserRepository;
import com.test.alfa.alfa.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User read(Integer id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Collection<User> find(String surname) {
        return userRepository.findBySurname(surname);
    }
}
