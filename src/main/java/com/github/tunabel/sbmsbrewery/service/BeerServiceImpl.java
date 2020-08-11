package com.github.tunabel.sbmsbrewery.service;

import com.github.tunabel.sbmsbrewery.web.model.BeerStyleEnum;
import org.springframework.stereotype.Service;
import com.github.tunabel.sbmsbrewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerID) {
        return BeerDto.builder()
                .beerID(UUID.randomUUID())
                .beerName("Pinlapong")
                .beerStyleEnum(BeerStyleEnum.HANOI)
                .upc(101L)
                .build();
    }

    @Override
    public BeerDto create() {
        return BeerDto.builder()
                .beerID(UUID.randomUUID())
                .beerName("Steak in cream")
                .beerStyleEnum(BeerStyleEnum.SAIGON)
                .upc(102L)
                .build();
    }

    @Override
    public void updateOne(BeerDto dto) {
        //TODO
    }

    @Override
    public void delete(UUID beerID) {
        //TODO
    }
}
