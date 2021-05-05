package com.example.bestellungservice.infrastructure.messagebroker;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface BuchChannels {


    String BUCHHANDLUNG_CREATION_CHANNEL_SINK = "buchhandlungCreationChannelSink";


    @Input(BUCHHANDLUNG_CREATION_CHANNEL_SINK)
    MessageChannel buchhandlungCreationChannelSink();



}
