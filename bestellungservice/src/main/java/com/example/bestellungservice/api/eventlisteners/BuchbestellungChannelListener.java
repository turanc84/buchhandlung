package com.example.bestellungservice.api.eventlisteners;


import com.example.bestellungservice.infrastructure.messagebroker.BuchbestellungChannels;
import com.example.bestellungservice.services.BuchbestellungCommandService;
import com.example.bestellungservice.shareddomain.events.BuchbestellungCreatedEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(BuchbestellungChannels.class)
public class BuchbestellungChannelListener {


    final BuchbestellungCommandService buchbestellungCommandService;


    public BuchbestellungChannelListener(BuchbestellungCommandService buchbestellungCommandService){


        this.buchbestellungCommandService = buchbestellungCommandService;

    }


    @StreamListener(target = BuchbestellungChannels.BESTELLUNG_CREATION_CHANNEL_SINK)
    public void processBuchbestellungCreated(BuchbestellungCreatedEvent buchbestellungCreatedEvent){


        log.info("Listened to Message Broker Flug Created Event: " + buchbestellungCreatedEvent.getBuchbestellungCreatedEventData());
    }





}
