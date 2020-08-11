package com.github.tunabel.sbmsbrewery.service;

import com.github.tunabel.sbmsbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID custID) {
        return CustomerDto.builder()
                .customerID(UUID.randomUUID())
                .customerName("Drinker")
                .phone("0123456789")
                .build();
    }

    @Override
    public CustomerDto create() {
        return CustomerDto.builder()
                .customerID(UUID.randomUUID())
                .customerName("Drinker")
                .phone("0123456789")
                .build();
    }

    @Override
    public void updateOne(CustomerDto dto) {
        //TODO
    }

    @Override
    public void delete(UUID custID) {
        //TODO
    }
}
