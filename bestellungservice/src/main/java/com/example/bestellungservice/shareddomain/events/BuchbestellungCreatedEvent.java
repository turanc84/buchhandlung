package com.example.bestellungservice.shareddomain.events;


import lombok.Data;

@Data
public class BuchbestellungCreatedEvent {

    BuchbestellungCreatedEventData buchbestellungCreatedEventData;

    public BuchbestellungCreatedEvent(){

    }


    public BuchbestellungCreatedEvent(BuchbestellungCreatedEventData buchbestellungCreatedEventData){


        this.buchbestellungCreatedEventData = buchbestellungCreatedEventData;

    }


    public BuchbestellungCreatedEventData getBuchbestellungCreatedEventData() {
        return buchbestellungCreatedEventData;
    }
}
