package com.example.bestellungservice.api.rest;


import com.example.bestellungservice.api.rest.dtos.CreateBuchbestellungDto;
import com.example.bestellungservice.domain.commands.CreateBuchbestellungCommand;

public class BuchbestellungCommandDtoMapper {

    public static CreateBuchbestellungCommand toCreateBestellungCommand(CreateBuchbestellungDto createBuchbestellungDto){


        return new CreateBuchbestellungCommand(

        createBuchbestellungDto.getBestellnummer(),
        createBuchbestellungDto.getBuchNummer(),
        createBuchbestellungDto.getBezahltJa(),
        createBuchbestellungDto.getVerfügbarJa(),
        createBuchbestellungDto.getBezahltJa(),
        createBuchbestellungDto.getBuchstart()

                );
    }



}
