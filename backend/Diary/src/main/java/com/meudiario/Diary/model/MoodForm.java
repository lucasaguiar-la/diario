package com.meudiario.Diary.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table (name = "mood_forms")
public class MoodForm {

    @EmbeddedId
    private MoodFormId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("tagId")
    @JoinColumn(name = "tag_id")
    private MoodTag tag;

    @NotBlank
    private String title;

}
