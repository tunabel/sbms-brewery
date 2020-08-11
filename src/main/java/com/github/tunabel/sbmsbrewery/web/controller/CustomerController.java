package com.github.tunabel.sbmsbrewery.web.controller;

import com.github.tunabel.sbmsbrewery.web.model.CustomerDto;
import com.github.tunabel.sbmsbrewery.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/get/{custID}")
    public ResponseEntity<CustomerDto> getById(@PathVariable UUID custID) {
        return new ResponseEntity<>(customerService.getById(custID), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<CustomerDto> create() {
        return new ResponseEntity<>(customerService.create(), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<UUID> update(@RequestBody CustomerDto dto) {
        customerService.updateOne(dto);
        return new ResponseEntity<>(dto.getCustomerID(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{beerID}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable UUID custID) {
        customerService.delete(custID);

    }
}
