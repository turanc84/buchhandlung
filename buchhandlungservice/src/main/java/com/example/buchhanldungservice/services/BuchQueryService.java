package com.example.buchhanldungservice.services;



import com.example.buchhanldungservice.domain.aggregate.Buch;
import com.example.buchhanldungservice.exception.BuchNotFoundException;
import com.example.buchhanldungservice.infrastructure.repositories.BuchRepository;
import org.springframework.stereotype.Service;

@Service
public class BuchQueryService {


    private final BuchRepository buchRepository;

    public BuchQueryService(BuchRepository buchRepository)
    {
        this.buchRepository = buchRepository;
    }

    public Buch getBuchbyBuchnummer(String buchnummer) throws BuchNotFoundException {


        return buchRepository.getBuchByBuchNummer(buchnummer).orElseThrow(BuchNotFoundException::new);

    }

    public boolean buchnummerExistiert(String buchnummer){

        return buchRepository.getBuchByBuchNummer(buchnummer).isPresent();
    }




}
