package edu.pri.firstspring.service.customer.interfaces;

import edu.pri.firstspring.model.Customer;

import java.util.List;

public interface ICustomerService {
    // CRUD

    Customer create(Customer customer);
    Customer get(String id);
    Customer update(Customer customer);
    Customer delete (String id);
    List<Customer>getAll();

}
