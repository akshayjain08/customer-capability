package com.dsas.customer.controller;

import com.dsas.customer.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

  private CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping
  public List<Customer> getCustomers() {
    return customerService.getCustomers();
  }

  @PostMapping
  public void createCustomer(@RequestBody Customer customer) {
    customerService.createCustomer(customer);
  }

  @PutMapping
  public void updateCustomer(@RequestBody Customer customer) {
    customerService.updateCustomer(customer);
  }

  @DeleteMapping("/{id}")
  public void deleteCustomer(@PathVariable("id") String customerId) {
    customerService.deleteCustomer(customerId);
  }
}
