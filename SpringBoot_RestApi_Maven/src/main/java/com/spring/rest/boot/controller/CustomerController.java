package com.spring.rest.boot.controller;

import com.spring.rest.boot.dto.CustomerDTO;
import com.spring.rest.boot.exception.CustomerNotFoundException;
import com.spring.rest.boot.model.Customer;
import com.spring.rest.boot.model.Person;
import com.spring.rest.boot.repo.CustomerRepostory;
import com.spring.rest.boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
   private CustomerService customerService;
    @Autowired
    private CustomerRepostory customerRepostory;

    @PostMapping("/signup")
    public ResponseEntity<Customer> saveCustomer(@RequestBody @Valid CustomerDTO customerDTO){
        return new ResponseEntity<>(customerService.saveCustomer(customerDTO), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public Customer fetchCustomer(@PathVariable("id")int id){
        if(customerRepostory.findById(id)==null)
            throw new CustomerNotFoundException("Customer not found with id,"+id);
        return customerRepostory.findById(id);
    }
}
