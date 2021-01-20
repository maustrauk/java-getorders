package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;

import java.util.List;

public interface CustomersService {
    Customer save(Customer customer);
    List<Customer> findAllCustomers();
    Customer findCustomerById(long id);
    List<Customer> findCustomerByNameLike(String namelike);
}
