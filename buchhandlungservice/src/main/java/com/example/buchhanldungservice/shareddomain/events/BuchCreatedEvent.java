package com.example.buchhanldungservice.shareddomain.events;


import lombok.Data;

@Data
public class BuchCreatedEvent {

    BuchCreatedEventData buchCreatedEventData;

    public BuchCreatedEvent(BuchCreatedEventData buchCreatedEventData){


        this.buchCreatedEventData = buchCreatedEventData;

    }

    public BuchCreatedEvent(){

    }

    public BuchCreatedEventData getBuchCreatedEventData() {
        return buchCreatedEventData;
    }
}
