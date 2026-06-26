package com.example.demo;

import com.example.demo.Note;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NoteRepository {

    private final List<Note> noteList = new ArrayList<>();
    private long idCounter = 1;

    public Note save(Note note) {
        note.setId(idCounter++); 
        noteList.add(note); 
        
        return note;
    }

    public List<Note> findAll() {
        return new ArrayList<>(noteList);
    }


    public Note update(Long id, String title, String content) {
        for (Note note : noteList) {
            if (note.getId().equals(id)) {
                
                note.setTitle(title);
                note.setContent(content);

                return note; 
            }
        }

        return null; 
    }


    public boolean deleteById(Long id) {

        return noteList.removeIf(note -> note.getId().equals(id));
    }
}


