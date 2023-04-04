package com.rost.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rost.model.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Long> {
}
