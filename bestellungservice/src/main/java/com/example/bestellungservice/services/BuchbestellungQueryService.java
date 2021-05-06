package com.example.bestellungservice.services;


import com.example.bestellungservice.domain.aggregate.Buchbestellung;
import com.example.bestellungservice.exception.BuchbestellungNotFoundException;
import com.example.bestellungservice.infrastructure.repositories.BuchbestellungRepository;
import org.springframework.stereotype.Service;

@Service
public class BuchbestellungQueryService {

//    private final BuchbestellungRepository buchbestellungRepository;
//
//    public BuchbestellungQueryService(BuchbestellungRepository buchbestellungRepository){
//
//        this.buchbestellungRepository = buchbestellungRepository;
//
//
//    }
//
//
//    public Buchbestellung getBuchbestellungByBestellnummer(String bestellnummer) throws BuchbestellungNotFoundException{
//
//        return buchbestellungRepository.getBuchbestellungByBestellnummer(bestellnummer).orElse(BuchbestellungNotFoundException::new);
//
//    }
//
//    public boolean bestellnummerExisting(String bestellnummer){
//
//        return buchbestellungRepository.getBuchbestellungByBestellnummer(bestellnummer).isPresent();
//    }


}
