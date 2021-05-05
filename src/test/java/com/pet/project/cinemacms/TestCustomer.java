package com.pet.project.cinemacms;

import com.pet.project.cinemacms.Models.Customer;
import com.pet.project.cinemacms.Repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TestCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testCustomerRepositorySaveMethodUsingSpringData(){
        Customer customer = this.customerRepository
                .save(new Customer(
                        "Semen1",
                        "Frontmen1",
                        "semenfront123@gmail.com",
                        "0093-123-12-23"));

        assertNotNull(customer);
        assertTrue(customer.getId() > 0);
    }

}



