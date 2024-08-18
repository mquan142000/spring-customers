package com.example.springcustomers.controller;

import com.example.springcustomers.model.Customer;
import com.example.springcustomers.model.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public String showCustomers(Model model) {
        List<Customer> customerList = customerService.showList();
        model.addAttribute("customerList", customerList);

        return "demo";
    }
}
