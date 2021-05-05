package com.example.bestellungservice.infrastructure.messagebroker;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BuchbestellungChannels {



    String BESTELLUNG_CREATION_CHANNEL_SOURCE = "bestellungCreationChannelSource";
    String BESTELLUNG_CREATION_CHANNEL_SINK = "bestellungCreationChannelSink";


    @Output(BESTELLUNG_CREATION_CHANNEL_SOURCE)
    MessageChannel bestellungCreationSource();

    @Input(BESTELLUNG_CREATION_CHANNEL_SINK)
    MessageChannel bestellungCreationChannelSink();


}
