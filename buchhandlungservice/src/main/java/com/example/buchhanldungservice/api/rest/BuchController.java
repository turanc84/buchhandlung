package com.example.buchhanldungservice.api.rest;


import com.example.buchhanldungservice.api.rest.dtos.CreateBuchDto;
import com.example.buchhanldungservice.exception.BuchNotFoundException;
import com.example.buchhanldungservice.exception.BuchnummerDuplicateException;
import com.example.buchhanldungservice.services.BuchCommandService;
import com.example.buchhanldungservice.services.BuchQueryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/buch")
public class BuchController {

    private BuchCommandService buchCommandService;
    private BuchQueryService buchQueryService;



    public BuchController(BuchCommandService buchCommandService, BuchQueryService buchQueryService) {

        this.buchCommandService = buchCommandService;
        this.buchQueryService = buchQueryService;

    }

    @PostMapping
    public ResponseEntity<?> createBuch(@RequestBody CreateBuchDto createBuchDto) throws BuchnummerDuplicateException {

        System.out.println("=====================================================================================");
        buchCommandService.createBuch(BuchCommandDtoMapper.toCreateBuchCommand(createBuchDto));

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{buchnummer}")
                .buildAndExpand(createBuchDto.getBuchNummer())
                .toUri();

        return ResponseEntity.created(location).build();

    }


    @GetMapping("/{buchnummer}")
    public ResponseEntity<CreateBuchDto> getBuch(@PathVariable String buchnummer) throws BuchNotFoundException
    {
        return new ResponseEntity<>(BuchEntityDtoMapper.createBuchDto(buchQueryService.getBuchbyBuchnummer(buchnummer)),
                HttpStatus.OK);
    }

}

