package com.meudiario.Diary.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Setter
@Getter
@Embeddable
public class NotesFormId implements Serializable {

    private int userId;
    private int noteId;
    private LocalDateTime createdAt;

    public NotesFormId() {}

    public NotesFormId(int userId, int noteId, LocalDateTime createdAt) {
        this.userId = userId;
        this.noteId = noteId;
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof NotesFormId that)) return false;
        return userId == that.userId &&
                noteId == that.noteId &&
                createdAt == (that.createdAt);
    }

    public int hashCode() {
        return Objects.hash(userId, noteId, createdAt);
    }

}
