package com.example.demo;

import com.example.demo.Note;
import com.example.demo.NoteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }


    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note.getTitle(),note.getContent());
    }


    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }


    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note) {
        return noteService.updateNote(id,note.getTitle(),note.getContent());
    }


    @DeleteMapping("/{id}")
    public String deleteNote(@PathVariable Long id) {
        if (noteService.deleteNote(id)) {
            return "Note deleted successfully.";
        } else {
            return "Note not found.";
        }
    }
}


