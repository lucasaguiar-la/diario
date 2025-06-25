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
public class MoodFormId implements Serializable {

    private int userId;

    private int tagId;
    private LocalDateTime createdAt;

    public MoodFormId() {}

    public MoodFormId(int userId, LocalDateTime createdAt) {
        this.userId = userId;
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MoodFormId)) return false;
        MoodFormId that = (MoodFormId) o;
        return userId == that.userId &&
                createdAt.equals(that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, createdAt);
    }

}
