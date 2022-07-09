package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(Person person);

    default int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(person);
    }

    List<Person> selectAllPeople(UUID id);

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);

}
