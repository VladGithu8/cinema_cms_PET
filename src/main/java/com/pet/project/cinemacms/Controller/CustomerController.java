package com.pet.project.cinemacms.Controller;

import com.pet.project.cinemacms.Models.Customer;
import com.pet.project.cinemacms.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("customerList", customerService.getAllCustomers());
        return "index";
    }

    @GetMapping("/showNewCustomerForm")
    public String showNewCustomerForm(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "new_customer";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/" ;
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value = "id") Long id, Model model){
        Customer customer = customerService.getCustomerByID(id);

        model.addAttribute("customer", customer);
        return "update_customer" ;
    }

    @GetMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable (value = "id") Long id){

        this.customerService.deleteCustomerById(id);
        return "redirect:/" ;

    }

}



