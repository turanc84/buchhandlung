package com.example.bestellungservice.services;


import com.example.bestellungservice.domain.aggregate.Buchbestellung;
import com.example.bestellungservice.domain.commands.CreateBuchbestellungCommand;
import com.example.bestellungservice.exception.BuchNotFoundException;
import com.example.bestellungservice.exception.BuchbestellungnummerDuplicateException;
import com.example.bestellungservice.infrastructure.repositories.BuchbestellungRepository;
import org.springframework.stereotype.Service;

@Service
public class BuchbestellungCommandService {

    private BuchbestellungRepository buchbestellungRepository;
    private BuchbestellungQueryService buchbestellungQueryService;
    private BuchQueryService buchQueryService;


    public BuchbestellungCommandService(BuchbestellungRepository buchbestellungRepository, BuchbestellungQueryService buchbestellungQueryService, BuchQueryService buchQueryService){

        this.buchbestellungRepository = buchbestellungRepository;
        this.buchbestellungQueryService = buchbestellungQueryService;
        this.buchQueryService = buchQueryService;

    }

    public String createBuchbestellung(CreateBuchbestellungCommand createBuchbestellungCommand) throws BuchbestellungnummerDuplicateException, BuchNotFoundException {

        Buchbestellung buchbestellung = new Buchbestellung(createBuchbestellungCommand);
        if(buchbestellungQueryService.bestellnummerExisting(buchbestellung.getBestellnummer())){

            throw new BuchbestellungnummerDuplicateException();

        }else if(!buchQueryService.buchnummerExistiert(buchbestellung.getBuchNummer())){

            throw new BuchNotFoundException();
        }
        else {
            buchbestellungRepository.save(buchbestellung);
            return buchbestellung.getBestellnummer();
        }

    }
}
