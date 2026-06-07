package com.example.demo;

import com.example.demo.Note;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// TODO: Annotate the class to indicate it's a repository
@Repository
public class NoteRepository {

    // In-memory list to store notes
    private final List<Note> noteList = new ArrayList<>();
    private long idCounter = 1;

    // 1. SAVE METHOD (Create)
    public Note save(Note note) {
        // TODO: Assign the current idCounter to the note, then increment the counter (use ++)
        note.setId(idCounter++); 
        
        // TODO: Add the note object to the noteList
        noteList.add(note); 
        
        return note;
    }


    // 2. findAll METHOD (Read)
    public List<Note> findAll() {
        // TODO: Return a new ArrayList containing the noteList (return a copy)
        return new ArrayList<>(noteList);
    }


    // 3. UPDATE METHOD (Update)
    public Note update(Long id, String title, String content) {
        // Iterate through the list to find the note
        for (Note note : noteList) {
            // TODO: Check if the current note's ID equals the passed 'id'
            if (note.getId().equals(id)) {
                
                // TODO: Update the note's title and content with the new values
                note.setTitle(title);
                note.setContent(content);
                
                // Return the updated note
                return note; 
            }
        }

        // Return null if note not found
        return null; 
    }


    // 4. DELETE METHOD (Delete)
    public boolean deleteById(Long id) {
        // TODO: Remove the note if its ID matches the passed id

        return noteList.removeIf(note -> note.getId().equals(id));
    }
}


