package com.meudiario.Diary.controller;
import com.meudiario.Diary.model.User;
import com.meudiario.Diary.service.DiaryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = diaryService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

}
