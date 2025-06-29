package com.meudiario.Diary.service;

import com.meudiario.Diary.model.User;
import com.meudiario.Diary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User findUser(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o id: " + id));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
