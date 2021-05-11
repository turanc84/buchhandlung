package com.example.bestellungservice.services;


import com.example.bestellungservice.infrastructure.messagebroker.BuchbestellungChannels;
import com.example.bestellungservice.shareddomain.events.BuchFuerBuchbestellungCreatedEvent;
import com.example.bestellungservice.shareddomain.events.BuchbestellungCreatedEvent;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@EnableBinding(BuchbestellungChannels.class)
public class DomainEventPublisherAndPublisherService {

    private final BuchbestellungChannels buchbestellungChannels;


    public DomainEventPublisherAndPublisherService(BuchbestellungChannels buchbestellungChannels){

        this.buchbestellungChannels = buchbestellungChannels;

    }

    @TransactionalEventListener
    public void handleBuchbestellungCreatedEvent(BuchbestellungCreatedEvent buchbestellungCreatedEvent){
        try {
            log.info("Listened to Domain Event -> Buchbestellung created: " + buchbestellungCreatedEvent.getBuchbestellungCreatedEventData());
            log.info("Send Domain Event Buchbestellung Created to Message Broker Queue");
            buchbestellungChannels.bestellungCreationSource().send(MessageBuilder.withPayload(buchbestellungCreatedEvent).build());

        }catch (Exception e){
            e.printStackTrace();
        }

        @TransactionalEventListener
        public void handleBuchForBuchbestellungCreatedEvent(BuchFuerBuchbestellungCreatedEvent buchFuerBuchbestellungCreatedEvent){
            try {
                log.info("Listened to Domain Event -> Buch created Event in Buchbestellung Service: " + buchFuerBuchbestellungCreatedEvent
                .getBuchFuerBuchbestellungCreatedEvent());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }



}
