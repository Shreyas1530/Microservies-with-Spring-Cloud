package com.panda.telecom.customer.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.panda.telecom.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
