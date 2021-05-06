package com.example.bestellungservice.shareddomain.events;


import lombok.Data;

@Data
public class BuchFuerBuchbestellungCreatedEvent {

    private BuchFuerBuchbestellungCreatedEventData buchFuerBuchbestellungCreatedEventData;




    public BuchFuerBuchbestellungCreatedEvent(BuchFuerBuchbestellungCreatedEventData buchFuerBuchbestellungCreatedEventData){


        this.buchFuerBuchbestellungCreatedEventData = buchFuerBuchbestellungCreatedEventData;

    }


    public BuchFuerBuchbestellungCreatedEventData getBuchFuerBuchbestellungCreatedEventData() {
        return buchFuerBuchbestellungCreatedEventData;
    }
}
