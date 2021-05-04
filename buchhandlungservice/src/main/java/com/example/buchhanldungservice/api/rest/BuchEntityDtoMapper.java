package com.example.buchhanldungservice.api.rest;


import com.example.buchhanldungservice.api.rest.dtos.CreateBuchDto;
import com.example.buchhanldungservice.domain.aggregate.Buch;

public class BuchEntityDtoMapper {


    public static CreateBuchDto createBuchDto(Buch buch){

        return new CreateBuchDto(

                buch.getBuchNummer(),
                buch.getBuchName()


        );


    }

}
