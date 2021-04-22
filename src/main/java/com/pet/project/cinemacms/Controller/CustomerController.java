package com.pet.project.cinemacms.Controller;

import com.pet.project.cinemacms.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("customerList", customerService.getAllCustomers());
        return "index";
    }
}
