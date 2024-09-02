package com.backend.yogesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.yogesh.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
   
}