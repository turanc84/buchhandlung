package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.services;


import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.aggregate.Buch;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.exceptions.BuchNotFoundException;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.infrastructure.repositories.BuchRepository;
import org.springframework.stereotype.Service;

@Service
public class BuchQueryService {


    private final BuchRepository buchRepository;

    public BuchQueryService(BuchRepository buchRepository)
    {
        this.buchRepository = buchRepository;
    }

    public Buch getBuchbyBuchnummer(String buchnummer) throws BuchNotFoundException{


        return buchRepository.getBuchByBuchNummer(buchnummer).orElseThrow(BuchNotFoundException::new);

    }

    public boolean buchnummerExistiert(String buchnummer){

        return buchRepository.getBuchByBuchNummer(buchnummer).isPresent();
    }




}
