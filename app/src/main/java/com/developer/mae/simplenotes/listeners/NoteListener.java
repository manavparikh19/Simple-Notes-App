package com.developer.mae.simplenotes.listeners;

import com.developer.mae.simplenotes.entities.Note;

public interface NoteListener {
    void onNoteClicked(Note note, int position);

}
