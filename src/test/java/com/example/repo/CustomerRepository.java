package com.example.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
