package com.example.bestellungservice.api.rest;

import com.example.bestellungservice.api.rest.dtos.CreateBuchbestellungDto;
import com.example.bestellungservice.domain.aggregate.Buchbestellung;

public class BuchbestellungEntityDtoMapper {

    public static CreateBuchbestellungDto createBuchbestellungDto(Buchbestellung buchbestellung){

        return new CreateBuchbestellungDto(

                buchbestellung.getBestellnummer(),
                buchbestellung.getBuchNummer(),
                buchbestellung.getBezahltJa(),
                buchbestellung.getVerfügbarJa(),
                buchbestellung.getBuchstart(),
                buchbestellung.getBuchziel()

        );

    }


}
