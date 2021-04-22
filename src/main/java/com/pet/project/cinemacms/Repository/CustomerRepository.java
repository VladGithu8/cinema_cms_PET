package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}


