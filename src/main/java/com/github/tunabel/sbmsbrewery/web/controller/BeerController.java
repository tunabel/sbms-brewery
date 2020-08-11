package com.github.tunabel.sbmsbrewery.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.github.tunabel.sbmsbrewery.web.model.BeerDto;
import com.github.tunabel.sbmsbrewery.service.BeerService;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @Autowired
    BeerService beerService;

    @GetMapping("/get/{beerID}")
    public ResponseEntity<BeerDto> getById(@PathVariable UUID beerID) {
        return new ResponseEntity<>(beerService.getBeerById(beerID), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<BeerDto> create() {
        return new ResponseEntity<>(beerService.create(), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<UUID> update(@RequestBody BeerDto dto) {
        beerService.updateOne(dto);
        return new ResponseEntity<>(dto.getBeerID(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{beerID}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable UUID beerID) {
        beerService.delete(beerID);

    }
}
