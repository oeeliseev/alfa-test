package com.test.alfa.alfa.controllers;

import com.test.alfa.alfa.models.User;
import com.test.alfa.alfa.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User create(@RequestBody @Valid User user) {
        return userService.create(user);
    }

    @GetMapping("/{id}")
    public User read(@PathVariable int id) {
        return userService.read(id);
    }

    @PutMapping
    public User update(@RequestBody @Valid User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }

    @GetMapping("/find/{surname}")
    public Collection<User> find(@PathVariable String surname) {
        return userService.find(surname);
    }
}
