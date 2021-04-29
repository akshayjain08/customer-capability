package com.dsas.customer.controller;

import com.dsas.customer.model.Customer;
import com.dsas.customer.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

  private CustomerRepository customerRepository;

  public List<Customer> getCustomers() {
    return customerRepository.findAll();
  }

  public void createCustomer(Customer customer) {
    customerRepository.save(customer);
  }

  public void updateCustomer(Customer customer) {
    customerRepository.save(customer);
  }

  public void deleteCustomer(String id) {
    customerRepository.deleteById(id);
  }
}
