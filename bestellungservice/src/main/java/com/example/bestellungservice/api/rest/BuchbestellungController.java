package com.example.bestellungservice.api.rest;


import com.example.bestellungservice.api.rest.dtos.CreateBuchbestellungDto;
import com.example.bestellungservice.exception.BuchNotFoundException;
import com.example.bestellungservice.exception.BuchbestellungNotFoundException;
import com.example.bestellungservice.exception.BuchbestellungnummerDuplicateException;
import com.example.bestellungservice.exception.UnknownRestCallException;
import com.example.bestellungservice.services.BuchbestellungCommandService;
import com.example.bestellungservice.services.BuchbestellungQueryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("Buchbestellung")
public class BuchbestellungController {


    private BuchbestellungCommandService buchbestellungCommandService;
    private BuchbestellungQueryService buchbestellungQueryService;



    public BuchbestellungController(BuchbestellungCommandService buchbestellungCommandService, BuchbestellungQueryService buchbestellungQueryService){


        this.buchbestellungCommandService = buchbestellungCommandService;
        this.buchbestellungQueryService = buchbestellungQueryService;


    }

    @PostMapping
    public ResponseEntity<?> createBuchbestellung(@RequestBody CreateBuchbestellungDto createBuchbestellungDto) throws UnknownRestCallException,
            BuchbestellungnummerDuplicateException, BuchNotFoundException
    {



            System.out.println("=======================================================================================================================");
            buchbestellungCommandService.createBuchbestellung(BuchbestellungCommandDtoMapper.toCreateBestellungCommand(createBuchbestellungDto));

            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{bestellnummer}")
                    .buildAndExpand(createBuchbestellungDto.getBestellnummer())
                    .toUri();


            return ResponseEntity.created(location).build();

    }

    @GetMapping("/{bestellnummer}")
    public ResponseEntity<CreateBuchbestellungDto> getBuchbestellung(@PathVariable String bestellnummer) throws BuchbestellungNotFoundException
    {


        return new ResponseEntity<>(BuchbestellungEntityDtoMapper.createBuchbestellungDto(buchbestellungQueryService.getBuchbestellungByBestellnummer(bestellnummer)), HttpStatus.OK);

    }


}
