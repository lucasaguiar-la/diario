package com.meudiario.Diary.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "notes_form")
public class NotesForm {

    @EmbeddedId
    private NotesFormId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("noteId")
    @JoinColumn(name = "note_id")
    private MoodNote note;

}
