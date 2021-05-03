package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.services;


import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.commands.CreateBuchCommand;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.infrastructure.repositories.BuchRepository;
import org.springframework.stereotype.Service;

@Service
public class BuchCommandService {


    private BuchRepository buchRepository;
    private BuchQueryService buchQueryService;


    public BuchCommandService(BuchRepository buchRepository, BuchQueryService buchQueryService){

        this.buchRepository = buchRepository;
        this.buchQueryService = buchQueryService;


    }

    public String createBuch(CreateBuchCommand createBuchCommand) throws


}
