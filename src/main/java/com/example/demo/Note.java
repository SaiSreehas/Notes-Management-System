package com.example.demo;

public class Note {
    private Long id;
    private String title;
    private String content;

    // Needed for Spring Boot to convert JSON to Object
    public Note() {}

    // 1. PARAMETERIZED CONSTRUCTOR
    // TODO: Assign the passed parameters to the class fields
    public Note(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // 2. GETTERS AND SETTERS

    // ID Getter & Setter
    public Long getId() {
        // TODO: Return the id
        return id;
    }

    public void setId(Long id) {
        // TODO: Update the id field
        this.id = id;
    }

    // Title Getter & Setter
    public String getTitle() {
        // TODO: Return the title
        return title;
    }

    public void setTitle(String title) {
        // TODO: Update the title field
        this.title = title;
    }

    // Content Getter & Setter
    public String getContent() {
        // TODO: Return the content
        return content;
    }

    public void setContent(String content) {
        // TODO: Update the content field
        this.content = content;
    }
}