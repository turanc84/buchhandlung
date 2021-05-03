package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.api.rest.dtos;

import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.aggregate.Buch;

public class BuchEntityDtoMapper {


    public static  CreateBuchDto createBuchDto(Buch buch){
        return new CreateBuchDto(
                buch.getBuchNummer(),
                buch.getBuchName()
        );

    }



}
