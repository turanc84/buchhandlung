package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.infrastructure.messagebroker;

//import org.springframework.cloud.stream.annotation.Input;
//import org.springframework.cloud.stream.annotation.Output;
//import org.springframework.messaging.MessageChannel;



public interface BuchChannels {


    String BUCHHANDLUNG_CREATION_CHANNEL_SOURCE = "buchhandlungCreationChannelSource";
    String BUCHHANDLUNG_CREATION_CHANNEL_SINK = "buchhandlungCreationChannelSink";


    @Output(BUCHHANDLUNG_CREATION_CHANNEL_SOURCE)
    MessageChannel buchhandlungCreationChannelSource();

    @Input(BUCHHANDLUNG_CREATION_CHANNEL_SINK)
    MessageChannel buchhandlungCreationChannelSink();








}
