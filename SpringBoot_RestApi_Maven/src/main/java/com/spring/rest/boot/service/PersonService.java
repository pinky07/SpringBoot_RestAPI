package com.spring.rest.boot.service;

import java.time.Period;
import java.util.Hashtable;

import com.spring.rest.boot.dto.PersonRequestDTO;
import com.spring.rest.boot.exception.PersonConstraintViolationException;
import com.spring.rest.boot.exception.PersonNotFoundException;
import com.spring.rest.boot.repo.CustomerRepostory;
import com.spring.rest.boot.repo.PersonRepositoy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.rest.boot.model.Person;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
public class PersonService {
	@Autowired
	PersonRepositoy personRepositoy;
	@Autowired
	CustomerRepostory customerRepostory;

@Transactional
public PersonRequestDTO savePerson(PersonRequestDTO personRequest) {
		log.info("save",personRequest.getFirstName());
		Person person = Person.build();
		personRepositoy.save(person);
		return personRequest;
	}

	public Hashtable<String, Person> getAll() {
		return (Hashtable<String, Person>) personRepositoy.findAll();
	}

	public Person getPerson(String id) {
		return personRepositoy.findById(id);

	}
}


