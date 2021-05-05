package com.example.bestellungservice.services;


import com.example.bestellungservice.domain.aggregate.Buch;
import com.example.bestellungservice.exception.BuchNotFoundException;
import com.example.bestellungservice.infrastructure.repositories.BuchRepository;
import org.springframework.stereotype.Service;

@Service
public class BuchQueryService {

    private final BuchRepository buchRepository;

    public BuchQueryService(BuchRepository buchRepository){

        this.buchRepository = buchRepository;

    }


    public Buch getBuchByBuchnummer(String buchnummer) throws BuchNotFoundException{

        return buchRepository.getBuchByBuchNummer(buchnummer).orElseThrow(BuchNotFoundException::new);

    }

    public boolean buchnummerExistiert(String buchnummer){
        return buchRepository.getBuchByBuchNummer(buchnummer).isPresent();
    }


}
