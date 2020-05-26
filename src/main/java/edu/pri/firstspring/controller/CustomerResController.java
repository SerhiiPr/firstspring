package edu.pri.firstspring.controller;

import edu.pri.firstspring.model.Customer;
import edu.pri.firstspring.service.customer.impls.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api/customer")
public class CustomerResController {

    @Autowired
    CustomerServiceImpl service;


    @RequestMapping("/list")
    List<Customer> getCustomers(){
        return service.getAll();
    }


}
