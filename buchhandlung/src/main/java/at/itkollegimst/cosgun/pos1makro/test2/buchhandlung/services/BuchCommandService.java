package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.services;


import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.aggregate.Buch;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.commands.CreateBuchCommand;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.exceptions.BuchnummerDiplicateException;
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

    public String createBuch(CreateBuchCommand createBuchCommand) throws BuchnummerDiplicateException{

        Buch buch = new Buch(createBuchCommand);
        if(buchQueryService.buchnummerExistiert(buch.getBuchNummer())){

            throw new BuchnummerDiplicateException();
        }
        else {

            buchRepository.save(buch);
            return buch.getBuchNummer();

        }
    }

}
