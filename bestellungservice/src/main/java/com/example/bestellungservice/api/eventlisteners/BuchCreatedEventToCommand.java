package com.example.bestellungservice.api.eventlisteners;


import com.example.bestellungservice.domain.commands.CreateBuchCommand;
import com.example.bestellungservice.shareddomain.events.BuchCreatedEvent;
import com.example.bestellungservice.shareddomain.events.BuchCreatedEventData;

public class BuchCreatedEventToCommand
{

    public static CreateBuchCommand toCommand(BuchCreatedEvent buchCreatedEvent){

        BuchCreatedEventData buchCreatedEventData = buchCreatedEvent.getBuchCreatedEventData();
        return new CreateBuchCommand(buchCreatedEventData.getBuchNummer());


    }



}
