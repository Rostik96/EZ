package com.rost.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Person {
    @Id
    private long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<Book> books;
}
