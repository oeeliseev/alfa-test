package com.test.alfa.alfa.controllers;

import com.test.alfa.alfa.models.User;
import com.test.alfa.alfa.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/{id}")
    public User read(@PathVariable Integer id) {
        return userService.read(id);
    }

    @PatchMapping
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userService.delete(id);
    }

    @GetMapping("/{surname}")
    public Collection<User> find(@PathVariable String surname) {
        return userService.find(surname);
    }
}
