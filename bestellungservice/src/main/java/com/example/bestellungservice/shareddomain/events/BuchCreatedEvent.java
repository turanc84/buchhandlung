package com.example.bestellungservice.shareddomain.events;


import lombok.Data;

@Data
public class BuchCreatedEvent {

    private BuchCreatedEventData buchCreatedEventData;


    public BuchCreatedEvent(){

    }

    public BuchCreatedEvent(BuchCreatedEventData buchCreatedEventData){


        this.buchCreatedEventData = buchCreatedEventData;

    }

    public BuchCreatedEventData getBuchCreatedEventData() {
        return buchCreatedEventData;
    }
}
