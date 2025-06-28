package com.meudiario.Diary.repository;

import com.meudiario.Diary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<User, Integer> {
}
