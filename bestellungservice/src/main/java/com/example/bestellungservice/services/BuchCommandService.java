package com.example.bestellungservice.services;


import com.example.bestellungservice.domain.aggregate.Buch;
import com.example.bestellungservice.domain.commands.CreateBuchCommand;
import com.example.bestellungservice.infrastructure.repositories.BuchRepository;
import org.springframework.stereotype.Service;

@Service
public class BuchCommandService {

    private BuchRepository buchRepository;


    public BuchCommandService(BuchRepository buchRepository){

        this.buchRepository = buchRepository;

    }


    public String createBuch(CreateBuchCommand createBuchCommand){

        Buch buch = new Buch(createBuchCommand);
        buchRepository.save(buch);
        return buch.getBuchNummer();

    }
}
