package com.meudiario.Diary.controller;

import com.meudiario.Diary.model.Log;
import com.meudiario.Diary.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/diario")
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @PostMapping
    public Log criarLog(@RequestBody Log log) {
        return diaryService.saveLog(log);
    }

}
