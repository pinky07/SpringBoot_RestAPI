package com.spring.rest.boot.repo;

import com.spring.rest.boot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoy extends JpaRepository<Person, Long> {
    Person findById(String id);
}
