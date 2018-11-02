package com.test.alfa.alfa.services;

import com.test.alfa.alfa.models.User;

import java.util.Collection;

public interface UserService {
    User create(User user);

    User read(Integer id);

    User update(User user);

    void delete(Integer id);

    Collection<User> find(String surname);
}
