package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.PersonService;
import model.Person;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	PersonService ps;//reference variable
	//whenever we want everything, its always store in form of key,value
	//so need to fetch it like key,value
	@RequestMapping("/all")
	 Hashtable<String,Person>getAll(){
		 //here we are calling service  class via reference variable
		return ps.getAll(); 
	}
	 @RequestMapping("{id}")
 public Person	getPerson(@PathVariable("id")String id) {
	return ps.getPerson(id);
}
	
	
}
