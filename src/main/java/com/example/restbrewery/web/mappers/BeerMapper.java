package com.example.restbrewery.web.mappers;

import com.example.restbrewery.domain.Beer;
import com.example.restbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {com.example.restbrewery.web.mappers.DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
