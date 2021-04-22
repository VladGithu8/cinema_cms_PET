package com.pet.project.cinemacms.Service;

import com.pet.project.cinemacms.Models.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    void saveCustomer(Customer customer);



}


