package com.test.alfa.alfa.services;

import com.test.alfa.alfa.models.User;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface UserService {
    User create(User user);

    User read(Integer id);

    User updatePut(User user);

    User updatePatch(User user);

    void delete(Integer id);

    Collection<User> find(String surName);
}
