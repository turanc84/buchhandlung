package com.example.bestellungservice.api.eventlisteners;


import com.example.bestellungservice.infrastructure.messagebroker.BuchChannels;
import com.example.bestellungservice.services.BuchCommandService;
import com.example.bestellungservice.shareddomain.events.BuchCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(BuchChannels.class)
@Slf4j
public class BuchChannelListener {

    private final BuchCommandService buchCommandService;

    public BuchChannelListener(BuchCommandService buchCommandService){


        this.buchCommandService = buchCommandService;

    }

    @StreamListener(target = BuchChannels.BUCHHANDLUNG_CREATION_CHANNEL_SINK)
    public void processBuchhandlungCreated(BuchCreatedEvent buchCreatedEvent){


        log.info("Listened to Message Briger -> Buch Creations: " + buchCreatedEvent.getBuchCreatedEventData());
        buchCommandService.createBuch(BuchCreatedEventToCommand.toCommand(BuchCreatedEvent));


    }




}
