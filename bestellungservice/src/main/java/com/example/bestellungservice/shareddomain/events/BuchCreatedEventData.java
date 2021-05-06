package com.example.bestellungservice.shareddomain.events;


import lombok.Data;

@Data
public class BuchCreatedEventData {

    private String buchNummer;
    private String buchName;


    public BuchCreatedEventData(String buchNummer, String buchName){


        this.buchNummer = buchNummer;
        this.buchName = buchName;


    }


    public String getBuchNummer() {
        return buchNummer;
    }

    public String getBuchName() {
        return buchName;
    }
}
