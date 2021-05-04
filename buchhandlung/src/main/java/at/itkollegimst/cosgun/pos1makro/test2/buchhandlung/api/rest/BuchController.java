package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.api.rest;


import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.api.rest.dtos.CreateBuchDto;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.exceptions.BuchnummerDiplicateException;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.services.BuchCommandService;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.services.BuchQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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



}
