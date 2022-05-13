package com.spring.rest.boot.controller;

import java.util.Hashtable;

import com.spring.rest.boot.dto.CustomerDTO;
import com.spring.rest.boot.exception.PersonConstraintViolationException;
import com.spring.rest.boot.dto.PersonRequestDTO;
import com.spring.rest.boot.model.Customer;
import com.spring.rest.boot.repo.CustomerRepostory;
import com.spring.rest.boot.repo.PersonRepositoy;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.spring.rest.boot.service.PersonService;
import com.spring.rest.boot.model.Person;

import javax.validation.Valid;
@Slf4j
@Validated
@RestController
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@Autowired
	PersonService personService;
	@Autowired
	PersonRepositoy personRepositoy;
	@GetMapping(value = "/all")
	 Hashtable<String,Person>getAll(){
		return personService.getAll();
	}
	@GetMapping(value = "/al")
	String getAlla(){
		return "hello";
	}
	@GetMapping("/persons/{id}")
 	public Person getPerson(@PathVariable("id")String id) {
		return personService.getPerson(id);
}
	@PostMapping("/save")
	public ResponseEntity<PersonRequestDTO> create(@Valid @RequestBody PersonRequestDTO person) {
		PersonRequestDTO personCreated=null;
		if (person != null) {
			 personCreated = personService.savePerson(person);
			throw new PersonConstraintViolationException(personCreated.getId());
		} else {
			return new ResponseEntity<>(personCreated,HttpStatus.CREATED);
		}
	}

}
