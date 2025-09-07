package org.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Developed by ChhornSeyha
 * Date: 07/09/2025
 */
@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable String id) {
        return "User " + id + " from user-service!";
    }
}
