package com.example.demo;

import com.example.demo.Note;
import com.example.demo.NoteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteService {
    
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }


    public Note createNote(String title, String content) {
        return noteRepository.save(new Note(null, title, content));
    }


    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }


    public Note updateNote(Long id, String title, String content) {
        return noteRepository.update(id, title, content);
    }


    public boolean deleteNote(Long id) {
        return noteRepository.deleteById(id);
    }
}


