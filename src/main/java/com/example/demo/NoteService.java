package com.example.demo;

import com.example.demo.Note;
import com.example.demo.NoteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

// TODO: Annotate this class to indicate it's a service component in Spring
@Service
public class NoteService {
    
    // Dependency
    private final NoteRepository noteRepository;

    // 1. CONSTRUCTOR INJECTION
    // TODO: Initialize the noteRepository using the passed parameter
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }


    // 2. CREATE NOTE
    public Note createNote(String title, String content) {
        // TODO: Create a new Note object (pass 'null' for ID) and save it using the repository
        return noteRepository.save(new Note(null, title, content));
    }


    // 3. GET ALL NOTES
    public List<Note> getAllNotes() {
        // TODO: Call the repository method to find all notes
        return noteRepository.findAll();
    }


    // 4. UPDATE NOTE
    public Note updateNote(Long id, String title, String content) {
        // TODO: Call the repository method to update the note
        return noteRepository.update(id, title, content);
    }


    // 5. DELETE NOTE
    public boolean deleteNote(Long id) {
        // TODO: Call the repository method to delete the note by its ID
        return noteRepository.deleteById(id);
    }
}


