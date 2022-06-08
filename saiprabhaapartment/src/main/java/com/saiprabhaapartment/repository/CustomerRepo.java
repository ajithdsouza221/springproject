package com.saiprabhaapartment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saiprabhaapartment.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String> {

}
