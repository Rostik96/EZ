package com.rost.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    private long id;
    private String name;
    private String author;
    @ManyToOne
    private Person owner;

    @Override
    public String toString() {
        return String.format("%s \"%s\"", name, author);
    }
}
