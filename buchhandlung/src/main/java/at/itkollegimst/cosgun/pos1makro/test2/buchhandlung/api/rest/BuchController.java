package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.api.rest;


import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.api.rest.dtos.CreateBuchDto;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.exceptions.BuchNotFoundException;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.exceptions.BuchnummerDiplicateException;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.services.BuchCommandService;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.services.BuchQueryService;
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
    public ResponseEntity<?> createBuch(@RequestBody CreateBuchDto createBuchDto) throws BuchnummerDiplicateException {

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
