package com.example.buchhanldungservice.api.rest;


import com.example.buchhanldungservice.api.rest.dtos.CreateBuchDto;
import com.example.buchhanldungservice.domain.commands.CreateBuchCommand;

public class BuchCommandDtoMapper {

    public static CreateBuchCommand toCreateBuchCommand(CreateBuchDto createBuchDto){

        return new CreateBuchCommand(


                createBuchDto.getBuchNummer(),
                createBuchDto.getBuchName()




        );



    }



}
