package com.example.buchhanldungservice.services;


import com.example.buchhanldungservice.domain.aggregate.Buch;
import com.example.buchhanldungservice.domain.commands.CreateBuchCommand;
import com.example.buchhanldungservice.exception.BuchnummerDuplicateException;
import com.example.buchhanldungservice.infrastructure.repositories.BuchRepository;
import org.springframework.stereotype.Service;

@Service
public class BuchCommandService {


    private BuchRepository buchRepository;
    private BuchQueryService buchQueryService;


    public BuchCommandService(BuchRepository buchRepository, BuchQueryService buchQueryService){

        this.buchRepository = buchRepository;
        this.buchQueryService = buchQueryService;


    }

    public String createBuch(CreateBuchCommand createBuchCommand) throws BuchnummerDuplicateException {

        Buch buch = new Buch(createBuchCommand);
        if(buchQueryService.buchnummerExistiert(buch.getBuchNummer())){

            throw new BuchnummerDuplicateException();
        }
        else {

            buchRepository.save(buch);
            return buch.getBuchNummer();

        }
    }

}
