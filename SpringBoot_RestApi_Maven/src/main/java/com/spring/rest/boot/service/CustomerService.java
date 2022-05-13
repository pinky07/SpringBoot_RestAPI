package com.spring.rest.boot.service;

import com.spring.rest.boot.dto.CustomerDTO;
import com.spring.rest.boot.model.Customer;
import com.spring.rest.boot.repo.CustomerRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepostory customerRepostory;
    public Customer saveCustomer(CustomerDTO customerDTO){
        Customer customer = Customer.build(customerDTO.getId(),
				customerDTO.getStatus(),
				customerDTO.getTotalFare(),
				customerDTO.getPnrNo());
        return customerRepostory.save(customer);
    }
    public List<Customer> getAllCustomer(){
        return customerRepostory.findAll();
    }
    public Optional<Customer> getCustomer(Integer id){
        return customerRepostory.findById(id);
    }
}
