package com.example.bestellungservice.shareddomain.events;


import lombok.Value;

@Value
public class BuchFuerBuchbestellungCreatedEventData {

    String buchnummer;

    public BuchFuerBuchbestellungCreatedEventData(String buchnummer){

        this.buchnummer = buchnummer;


    }

    public String getBuchnummer() {
        return buchnummer;
    }
}
