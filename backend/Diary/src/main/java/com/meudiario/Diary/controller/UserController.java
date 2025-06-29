package com.meudiario.Diary.controller;
import com.meudiario.Diary.model.User;
import com.meudiario.Diary.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> findUser(@PathVariable int id) {
        User user = userService.findUser(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users/all")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

}