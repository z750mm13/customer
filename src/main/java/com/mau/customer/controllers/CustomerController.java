package com.mau.customer.controllers;

import com.mau.customer.entities.Customer;
import com.mau.customer.repositories.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    ICustomerRepository customer;

    @GetMapping()
    public List<Customer> list() {
        return customer.findAll();
    }

    @GetMapping("/{id}")
    public Customer get(@PathVariable String id) {return null;}

    @PutMapping("{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Customer customer) {return null;}

    @PostMapping()
    public ResponseEntity<?> post(@RequestBody Customer customer) {
        return ResponseEntity.ok(this.customer.save(customer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }

}
