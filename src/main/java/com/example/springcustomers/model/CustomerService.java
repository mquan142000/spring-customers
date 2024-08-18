package com.example.springcustomers.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "John Doe", "johndoe@example.com", "123 Main St"));
        customers.add(new Customer(2, "Jane Smith", "janesmith@example.com", "456 Elm St"));
        customers.add(new Customer(3, "Alice Johnson", "alicejohnson@example.com", "789 Oak St"));
        customers.add(new Customer(4, "Bob Brown", "bobbrown@example.com", "101 Maple St"));
    }
    public List<Customer> showList(){
        return customers;
    }
}
