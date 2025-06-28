package com.meudiario.Diary.service;

import com.meudiario.Diary.model.User;
import com.meudiario.Diary.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryService {

    @Autowired
    private DiaryRepository diaryRepository;

    public User createUser(User user) {
        return diaryRepository.save(user);
    }

}
