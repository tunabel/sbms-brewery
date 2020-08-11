package com.github.tunabel.sbmsbrewery.service;

import com.github.tunabel.sbmsbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerID);

    BeerDto create();

    void updateOne(BeerDto dto);

    void delete(UUID beerID);
}
