package com.tipu96.customers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private final CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> GetAllCustomers(){
        return customerRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void AddCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
    }

    @PutMapping("{id}")
    public void UpdateCustomers(@PathVariable Integer id, @RequestBody Customer customer){
        if (customerRepository.existsById(id)) {
            customer.setId(id);
            customerRepository.save(customer);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void DeleteCustomer(@PathVariable Integer id){
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
    }
}
