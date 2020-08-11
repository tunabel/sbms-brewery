package com.github.tunabel.sbmsbrewery.service;

import com.github.tunabel.sbmsbrewery.web.model.BeerDto;
import com.github.tunabel.sbmsbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getById(UUID custID);

    CustomerDto create();

    void updateOne(CustomerDto dto);

    void delete(UUID custID);
}
