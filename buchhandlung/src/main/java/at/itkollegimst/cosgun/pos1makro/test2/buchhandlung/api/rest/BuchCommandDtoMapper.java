package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.api.rest;

import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.api.rest.dtos.CreateBuchDto;
import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.commands.CreateBuchCommand;

public class BuchCommandDtoMapper {

    public static CreateBuchCommand toCreateBuchCommand(CreateBuchDto createBuchDto){

        return new CreateBuchCommand(


                createBuchDto.getBuchNummer(),
                createBuchDto.getBuchName()




        );



    }



}
