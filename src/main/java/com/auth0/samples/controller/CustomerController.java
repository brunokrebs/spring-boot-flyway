package com.auth0.samples.controller;

import com.auth0.samples.model.Customer;
import com.auth0.samples.persistence.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(path = "/customers/", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
