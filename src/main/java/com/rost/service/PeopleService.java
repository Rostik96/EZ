package com.rost.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rost.model.Person;
import com.rost.repositories.PeopleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PeopleService {
    private final PeopleRepository repository;

    @Transactional
    public List<Person> index() {
        return repository.findAll();
    }
}
