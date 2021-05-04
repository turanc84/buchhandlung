package com.example.buchhanldungservice.api.eventlisteners;



import com.example.buchhanldungservice.infrastructure.messagebroker.BuchChannels;
import com.example.buchhanldungservice.services.BuchCommandService;
import com.example.buchhanldungservice.shareddomain.events.BuchCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(BuchChannels.class)
@Slf4j
public class BuchChannelListener {

    final BuchCommandService buchCommandService;

    public BuchChannelListener(BuchCommandService buchCommandService){


        this.buchCommandService = buchCommandService;

    }


    @StreamListener(target = BuchChannels.BUCHHANDLUNG_CREATION_CHANNEL_SINK)
    public void processBuchCreated(BuchCreatedEvent buchCreatedEvent){


        log.info("Listened to Message Broker Buch Created Event: " + buchCreatedEvent.getBuchCreatedEventData());

    }



}
