package com.pet.project.cinemacms.Service.ServiceInterface;

import com.pet.project.cinemacms.Models.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomerByID(Long id);

    void deleteCustomerById(Long id);

}


