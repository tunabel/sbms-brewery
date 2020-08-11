package com.github.tunabel.sbmsbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
    private UUID beerID;
    private String beerName;
    private BeerStyleEnum beerStyleEnum;
    private long upc;
}
