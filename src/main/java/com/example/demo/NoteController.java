package com.example.demo;

import com.example.demo.Note;
import com.example.demo.NoteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// TODO: Add the annotation to mark this class as a REST Controller
@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    // 1. CONSTRUCTOR INJECTION
    // TODO: Initialize the noteService variable using the passed parameter
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }


    // 2. CREATE A NOTE (POST)
    // TODO: Add the correct annotation to handle HTTP POST requests
    @PostMapping
    public Note createNote(@RequestBody Note note) {
        // TODO: Call the service to create a note using the title and content from the body
        return noteService.createNote(note.getTitle(),note.getContent());
    }


    // 3. GET ALL NOTES (GET)
    // TODO: Add the correct annotation to handle HTTP GET requests
    @GetMapping
    public List<Note> getAllNotes() {
        // TODO: Call the service to get the list of all notes
        return noteService.getAllNotes();
    }


    // 4. UPDATE A NOTE (PUT)
    // TODO: Add the annotation to map PUT requests with an {id} parameter
    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note) {
        // TODO: Call the service to update the note with the new data
        return noteService.updateNote(id,note.getTitle(),note.getContent());
    }


    // 5. DELETE A NOTE 
    // TODO: Add the annotation to map DELETE requests with an {id} parameter
    @DeleteMapping("/{id}")
    public String deleteNote(@PathVariable Long id) {
        // TODO: Call the service to delete the note. (It returns true if successful)
        if (noteService.deleteNote(id)) {
            return "Note deleted successfully.";
        } else {
            return "Note not found.";
        }
    }
}


