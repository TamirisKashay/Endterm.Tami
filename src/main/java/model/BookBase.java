package model;

import interfaces.Displayable;
import interfaces.Validatable;

public abstract class BookBase implements Displayable, Validatable {
    private int id; // [cite: 15]
    private String title; // [cite: 15]

    public BookBase(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public void printBaseStatus() {
        System.out.println("Processing book ID: " + id);
    }

    public abstract String getBookType();
    public abstract double calculateLateFee(int days);
}