package com.spring.rest.boot.repo;

import com.spring.rest.boot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepostory extends JpaRepository<Customer, Integer> {
        Customer findById(int id);
}
