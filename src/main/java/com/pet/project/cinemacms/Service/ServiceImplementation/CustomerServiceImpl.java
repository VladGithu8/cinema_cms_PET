package com.pet.project.cinemacms.Service.ServiceImplementation;

import com.pet.project.cinemacms.Models.Customer;
import com.pet.project.cinemacms.Repository.CustomerRepository;
import com.pet.project.cinemacms.Service.ServiceInterface.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerByID(Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        Customer customer;
        if(customerOptional.isPresent()){
            customer = customerOptional.get();
        } else {
            throw new RuntimeException("Customer not found by id: " + id);
        }
        return customer;
    }

    @Override
    public void deleteCustomerById(Long id) {
        this.customerRepository.deleteById(id);
    }

}


