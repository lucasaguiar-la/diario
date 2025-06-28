package com.meudiario.Diary.service;

import com.meudiario.Diary.model.Log;
import com.meudiario.Diary.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryService {

    @Autowired
    private DiaryRepository diaryRepository;

    public Log saveLog(Log log) {
        return diaryRepository.save(log);
    }

}
