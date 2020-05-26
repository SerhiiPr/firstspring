package edu.pri.firstspring.service.customer.impls;

import edu.pri.firstspring.model.Customer;
import edu.pri.firstspring.service.customer.interfaces.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class CustomerServiceImpl implements ICustomerService {
    private List<Customer> customers = new ArrayList<>(

            Arrays.asList(
                    new Customer("1","Vasya","44562"),
                    new Customer("2","Peter","33384"),
                    new Customer("3","Vitaliy","75963")
            )

    );




    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public Customer get(String id) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Customer delete(String id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }
}
