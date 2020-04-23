package com.codeclan.example.BookingsSystem.repositories;

import com.codeclan.example.BookingsSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
